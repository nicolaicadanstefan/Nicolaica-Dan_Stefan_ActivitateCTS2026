package src;

public class Main {
    public static void main(String[] args) {
        Executant tv = new Televizor();

        Comanda pornire = new PornireTv(tv);
        Comanda oprire = new OprireTv(tv);

        ManagerComenzi telecomanda = new ManagerComenzi();

        telecomanda.setComanda(pornire);
        telecomanda.apasaButon();
        telecomanda.setComanda(oprire);
        telecomanda.apasaButon();
    }
}