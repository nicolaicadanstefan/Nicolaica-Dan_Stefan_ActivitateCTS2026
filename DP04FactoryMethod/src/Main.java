package src;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fabrica1 = new FactoryConcretA();
        InterfataProdus p1 = fabrica1.getProdus("");
        p1.actiune();

        AbstractFactory fabrica2 = new FactoryConcretB();
        InterfataProdus p2 = fabrica2.getProdus("");
        p2.actiune();
    }
}