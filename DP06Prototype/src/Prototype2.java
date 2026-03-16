package src;

public class Prototype2 extends AbstractPrototype {
    private String nume;
    private int mana;

    public Prototype2(String nume, int mana) {
        this.nume = nume;
        this.mana = mana;
    }

    @Override
    public AbstractPrototype clone() {
        return new Prototype2(this.nume, this.mana);
    }

    public void afisare() {
        System.out.println("Magician: " + nume + ", mana: " + mana);
    }
}