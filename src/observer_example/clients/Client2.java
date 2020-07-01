package observer_example.clients;

import observer_example.observable.MyObservable;
import observer_example.observer.MyObserver;

public class Client2 implements MyObserver {

    private String message;

    @Override
    public void update(MyObservable o, Object arg) {
        this.message=(String) arg;
        show(message);
    }

    private void show(String message){
        System.out.println("client 2  : " + message);
    }
}
