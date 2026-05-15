package src;

public class Originator {
    private String stare;

    public void setStare(String stare) {
        this.stare = stare;
        System.out.println("Stare curenta: " + stare);
    }

    public String getStare() {
        return stare;
    }

    public Memento creareMemento() {
        return new Memento(stare);
    }

    public void setMemento(Memento memento) {  // +setMemento
        this.stare = memento.getStare();
        System.out.println("Restaurat la: " + stare);
    }
}