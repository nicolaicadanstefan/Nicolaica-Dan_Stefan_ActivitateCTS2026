package src;

public class Main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();

        InterfataProdus animal1 = fabrica.getProdus("caine");
        animal1.actiune();

        InterfataProdus animal2 = fabrica.getProdus("pisica");
        animal2.actiune();
    }
}