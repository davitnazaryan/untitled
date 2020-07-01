package observer_example.observer;
import observer_example.observable.MyObservable;

public interface MyObserver {

    void update(MyObservable o, Object arg);

}
