package src;

public class EcranSmartwatch implements Observer {
    @Override
    public void notificare() {
        System.out.println("Smartwatch: temperatura s-a schimbat!");
    }
}