import FactoryMethod.FactoryLivrareStandard;
import FactoryMethod.FactoryLivrareExpress;
import FactoryMethod.FactoryLivrareProgramata;

void main() {
    FactoryLivrareStandard livrareStandard1 = new FactoryLivrareStandard();
    int timpActual = 16;
    Scanner sc = new Scanner(System.in);
    System.out.println("Va rugam sa introduceti ora la care doriti comanda: ");
    int oraClient = sc.nextInt();
    livrareStandard1.createLivrare().calculeazaCost();
    livrareStandard1.createLivrare().afiseazaDetalii();
    sc.close();
}