package FactoryMethod;

public class FactoryLivrareExpress extends LivrareFactory {
    @Override
    public Livrare createLivrare() {
        return new LivrareExpress();
    }
}
