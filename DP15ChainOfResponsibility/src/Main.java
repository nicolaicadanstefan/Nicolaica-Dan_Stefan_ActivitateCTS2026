import src.Handler;
import src.Manager;
import src.SefEchipa;

public class Main {
    public static void main(String[] args) {

        Handler sefEchipa = new SefEchipa();
        Handler manager = new Manager();

        sefEchipa.setSuccesor(manager);

        sefEchipa.gestioneazaCerere(2);

        System.out.println("---");

        sefEchipa.gestioneazaCerere(5);

        System.out.println("---");

        sefEchipa.gestioneazaCerere(10);
    }
}