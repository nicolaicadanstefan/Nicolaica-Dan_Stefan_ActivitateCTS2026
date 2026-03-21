public class Main {
    public static void main(String[] args) {
        Singleton c1 = Singleton.getInstanta();
        c1.executa();

        Singleton c2 = Singleton.getInstanta();
        c2.executa();

        System.out.println("Aceeasi instanta? " + (c1 == c2));
    }
}