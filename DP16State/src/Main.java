package src;

public class Main {
    public static void main(String[] args) {
        Context semafor = new Context();

        semafor.setStare(new Rosu());
        semafor.request();

        semafor.setStare(new Galben());
        semafor.request();

        semafor.setStare(new Verde());
        semafor.request();
    }
}