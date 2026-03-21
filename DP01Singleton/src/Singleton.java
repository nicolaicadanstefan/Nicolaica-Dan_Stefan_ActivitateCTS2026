public class Singleton {
    private static Singleton instanta;

    private Singleton() {
        System.out.println("Conexiune la baza de date creata.");
    }

    public static Singleton getInstanta() {
        if (instanta == null) {
            instanta = new Singleton();
        }
        return instanta;
    }

    public void executa() {
        System.out.println("Folosesc conexiunea la baza de date.");
    }
}