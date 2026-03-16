package src;

public class Prototype1 extends AbstractPrototype {
    private String nume;
    private int viata;

    public Prototype1(String nume, int viata) {
        this.nume = nume;
        this.viata = viata;
    }

    @Override
    public AbstractPrototype clone() {
        return new Prototype1(this.nume, this.viata);
    }

    public void afisare() {
        System.out.println("Razboinic: " + nume + ", viata: " + viata);
    }
}