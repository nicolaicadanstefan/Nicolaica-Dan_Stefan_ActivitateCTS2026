package src;

public class EcranTelefon implements Observer {
    @Override
    public void notificare() {
        System.out.println("Telefon: temperatura s-a schimbat!");
    }
}