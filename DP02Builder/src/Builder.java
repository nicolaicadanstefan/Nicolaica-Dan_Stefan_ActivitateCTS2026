package src;

public class Builder extends AbstractBuilder {
    private Produs produs = new Produs();

    @Override
    public void adaugaComponenta1() {
        produs.setcomponenta1("Intel i9");
        System.out.println("Adaugat: procesor Intel i9");
    }

    @Override
    public void adaugaComponenta2() {
        produs.setcomponenta2("32GB RAM");
        System.out.println("Adaugat: 32GB RAM");
    }

    @Override
    public Produs getProdus() {
        return produs;
    }
}