package FactoryMethod;

public class FactoryLivrareStandard extends LivrareFactory{
    @Override
    public Livrare createLivrare() {
        return new LivrareStandard();
    }
}
