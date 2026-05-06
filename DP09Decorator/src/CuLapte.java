package src;

public class CuLapte extends Decorator {
    private String atributNou = "lapte";

    public CuLapte(ProdusAbstract produsDecorat) {
        super(produsDecorat);
    }

    @Override
    public void operatie() {
        super.operatie();
        metodaNoua();
    }

    public void metodaNoua() {             // +metodaNoua()
        System.out.println("+ adaug: " + atributNou);
    }
}