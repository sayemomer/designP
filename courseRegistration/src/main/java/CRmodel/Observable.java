package CRmodel;

import CRview.Observer;

public interface Observable {

        void registerObserver(Observer o);
        void removeObserver(Observer o);
        void notifyObservers();

}