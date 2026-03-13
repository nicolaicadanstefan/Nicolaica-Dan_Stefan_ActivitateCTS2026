//import FactoryMethod. FactoryLivrareStandard;
import FactoryMethod.FactoryLivrareExpress;
import FactoryMethod.FactoryLivrareProgramata;
import Singleton.Logger;

void main() {
//    ---- Factory Method ----
//    FactoryLivrareStandard livrareStandard1 = new FactoryLivrareStandard();
//    int timpActual = 16;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Va rugam sa introduceti ora la care doriti comanda: ");
//    int oraClient = sc.nextInt();
//    livrareStandard1.createLivrare().calculeazaCost();
//    livrareStandard1.createLivrare().afiseazaDetalii();
//    sc.close();

//    ---- Singleton Testing ----
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();

    if(logger1 == logger2) {
        System.out.println("Ambele variabile folosesc aceeasi instanta");
    } else {
        System.out.println("Instante diferite!");
    }
}