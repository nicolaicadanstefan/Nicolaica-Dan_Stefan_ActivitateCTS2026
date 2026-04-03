package magazinpantofi;

import java.util.HashMap;
import java.util.Map;

public class Inventar {
    Map<String, Integer> stoc = new HashMap<String, Integer>();

    public Inventar() {
        this.stoc.put("Tenisi_42", 5);
        this.stoc.put("Ghete_40", 0);
    }

    public void verificaStoc(String tip, int numar) {
        if (stoc.get(tip) == null || stoc.get(tip) == 0) {
            throw new OutOfStockException("Nu exista acest tip pe stoc!");
        } else {
            System.out.println("Stoc valabil: " + stoc.get(tip));
        }
    }
}
