package src;

public class Memento {
    private String stare;

    public Memento(String stare) {
        this.stare = stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public String getStare() {
        return stare;
    }
}