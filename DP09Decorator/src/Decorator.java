package src;

public abstract class Decorator extends ProdusAbstract {
    private ProdusAbstract produsDecorat;

    public Decorator(ProdusAbstract produsDecorat) {
        this.produsDecorat = produsDecorat;
    }

    @Override
    public void operatie() {
        produsDecorat.operatie();
    }
}