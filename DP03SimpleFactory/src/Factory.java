package src;

public class Factory {
    public InterfataProdus getProdus(String tip) {
        if (tip.equals("caine")) {
            return new Caine();
        } else if (tip.equals("pisica")) {
            return new Pisica();
        }
        throw new IllegalArgumentException("Tip necunoscut: " + tip);
    }
}