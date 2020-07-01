package observer_example.observable;

import observer_example.observer.MyObserver;

import java.util.Vector;

public class MyObservable {

    boolean changed = false;
    private Vector<MyObserver> clients;

    public MyObservable() {
        this.clients = new Vector<>();
    }

    public synchronized void addClient(MyObserver o) {

        if (o == null) {
            throw new NullPointerException();
        }
        if (!clients.contains(o)) {
            this.clients.add(o);
        }
    }

    public synchronized void removeClient(MyObserver o) {
        clients.remove(o);
    }

    public void notifyClients(Object obj) {

        Object[] arr;
        synchronized (this) {
            if (!changed) {
                return;
            }
            arr = this.clients.toArray();
            clearChanges();
        }
        for (Object o : arr) {
            ((MyObserver) o).update(this, obj);
        }
    }

    protected synchronized void clearChanges() {
        this.changed = false;
    }

    protected synchronized void setChanged() {
        this.changed = true;
    }
}
