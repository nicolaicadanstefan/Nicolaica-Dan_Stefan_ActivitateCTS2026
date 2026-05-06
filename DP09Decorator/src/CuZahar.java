package src;

public class CuZahar extends Decorator {

    public CuZahar(ProdusAbstract produsDecorat) {
        super(produsDecorat);
    }

    @Override
    public void operatie() {
        super.operatie();
        metodaNoua();
    }

    public void metodaNoua() {
        System.out.println("+ adaug: zahar");
    }
}