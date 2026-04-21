package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> colectieObservatori = new ArrayList<>(); // -colectieObservatori:Observer

    public void abonareObservator(Observer observator) {
        colectieObservatori.add(observator);
    }

    public void dezabonareObservator(Observer observator) {
        colectieObservatori.remove(observator);
    }

    public void notificareObservatori() {
        for (Observer o : colectieObservatori) {
            o.notificare();
        }
    }
}