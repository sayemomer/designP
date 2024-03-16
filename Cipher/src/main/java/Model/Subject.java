package Model;

import View.Observer;

public interface Subject {

    void attach(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
