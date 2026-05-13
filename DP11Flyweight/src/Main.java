public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getObiectFlyweight("Stejar-Verde").operatie("x=10, y=20");
        factory.getObiectFlyweight("Stejar-Verde").operatie("x=50, y=80");
        factory.getObiectFlyweight("Stejar-Verde").operatie("x=30, y=60");
        factory.getObiectFlyweight("Pin-Albastru").operatie("x=15, y=40");
        factory.getObiectFlyweight("Pin-Albastru").operatie("x=70, y=90");

        System.out.println("\nObiecte flyweight create in memorie: " + factory.getNumarFlyweights());
    }
}