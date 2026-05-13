public class FlyweightConcret implements Flyweight {
    private String starePermanenta;

    public FlyweightConcret(String starePermanenta) {
        this.starePermanenta = starePermanenta;
        System.out.println("Creat flyweight nou: " + starePermanenta);
    }

    @Override
    public void operatie(String stareTemporara) {
        System.out.println("Copac [" + starePermanenta + "] la pozitia: " + stareTemporara);
    }
}