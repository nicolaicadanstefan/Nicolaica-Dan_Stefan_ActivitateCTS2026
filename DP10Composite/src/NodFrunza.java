package src;

public class NodFrunza extends ComponentaAbstracta {
    private String nume;

    public NodFrunza(String nume) {
        this.nume = nume;
    }

    @Override
    public void metodaSpecifica() {
        System.out.println("  Angajat: " + nume);
    }
}