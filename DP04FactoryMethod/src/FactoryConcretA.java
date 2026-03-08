package src;

public class FactoryConcretA extends AbstractFactory {
    @Override
    public InterfataProdus getProdus(String argumente) {
        return new Masina();
    }
}