import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> colectieFlyweight = new HashMap<>();

    public Flyweight getObiectFlyweight(String cheie) {
        if (!colectieFlyweight.containsKey(cheie)) {
            colectieFlyweight.put(cheie, new FlyweightConcret(cheie));
        } else {
            System.out.println("Reutilizat flyweight: " + cheie);
        }
        return colectieFlyweight.get(cheie);
    }

    public int getNumarFlyweights() {
        return colectieFlyweight.size();
    }
}