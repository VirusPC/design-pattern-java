import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> observerList = new ArrayList<Observer>();

    private void notifyAllObserver(String state) {
        for(Observer observer: observerList){
            observer.update(state);
        }
    }

}
