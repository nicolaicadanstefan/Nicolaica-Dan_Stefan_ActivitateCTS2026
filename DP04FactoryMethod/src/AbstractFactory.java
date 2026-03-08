package src;

public abstract class AbstractFactory {
    public abstract InterfataProdus getProdus(String argumente);

    public void alteMetode() {
        System.out.println("Metoda comuna din AbstractFactory.");
    }
}