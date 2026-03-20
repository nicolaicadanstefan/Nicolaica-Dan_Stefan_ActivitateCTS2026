// LivrareStandard.java
import FactoryMethod.Livrare;

public class LivrareStandard extends Livrare {

    @Override
    public int calculeazaCost() {
        // Conform cerintei: timp estimat = 60 minute, cost = 10 lei
        this.timpEstimareMin = 60;
        this.cost = 10;
        return this.cost;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Livrare Standard - timp estimat: " + timpEstimareMin + " minute, cost: " + cost + " lei");
    }
}