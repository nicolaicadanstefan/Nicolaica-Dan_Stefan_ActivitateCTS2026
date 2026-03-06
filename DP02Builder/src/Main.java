package src;

// Main (Client)
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Director director = new Director(builder);

        director.construieste();

        Produs calculator = builder.getProdus();
        calculator.afisare();
    }
}