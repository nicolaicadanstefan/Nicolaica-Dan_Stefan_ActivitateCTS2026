package src;

public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void construieste() {
        builder.adaugaComponenta1();
        builder.adaugaComponenta2();
    }
}