package observer_example.server;

import observer_example.observable.MyObservable;


public class Server extends MyObservable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyClients(message);
    }
}
