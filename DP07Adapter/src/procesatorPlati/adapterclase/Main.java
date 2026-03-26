package src.procesatorPlati.adapterclase;

public class Main {
    public static void main(String[] args) throws Exception {
        AdapterParcare adapterParcare1 = new AdapterParcare(5,10);
        AdapterParcare adapterParcare2 = new AdapterParcare(24,10000);
        System.out.println(adapterParcare1.getTarifOrar());
        System.out.println(adapterParcare2.getTarifZilnic());
    }
}