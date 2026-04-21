package src;

public class StatieMeteo extends Observabil {
    private double stare; // temperatura

    public void modificareStare(double temperaturaNoua) {
        this.stare = temperaturaNoua;
        generareEveniment();
    }

    public void generareEveniment() {
        System.out.println("\nTemperatura actuala: " + stare + " grade");
        notificareObservatori(); // anunta toti observatorii
    }
}