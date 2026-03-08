package src;

public class FactoryConcretB extends AbstractFactory {
    @Override
    public InterfataProdus getProdus(String argumente) {
        return new Motocicleta();
    }
}