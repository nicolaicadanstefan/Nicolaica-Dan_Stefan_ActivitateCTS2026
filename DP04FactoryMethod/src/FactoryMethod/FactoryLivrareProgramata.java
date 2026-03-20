package FactoryMethod;

public class FactoryLivrareProgramata extends LivrareFactory {
    @Override
    public Livrare createLivrare() {
        return new LivrareProgramata();
    }
}
