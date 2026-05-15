package src;

import java.util.ArrayList;
import java.util.List;

public class ManagerStari {
    private List<Memento> memento = new ArrayList<>();

    public void adaugaMemento(Memento m) {
        memento.add(m);
    }

    public Memento getMemento(int index) {
        return memento.get(index);
    }
}