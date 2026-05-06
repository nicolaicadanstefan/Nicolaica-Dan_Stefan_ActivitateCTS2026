package src;

public class Main {
    public static void main(String[] args) {

        ProdusAbstract cafea = new Cafea();
        cafea.operatie();


        System.out.println("-------------------------");


        ProdusAbstract cafeaCuLapte = new CuLapte(cafea);
        cafeaCuLapte.operatie();

        System.out.println("-------------------------");

        ProdusAbstract cafeaCompleta = new CuZahar(new CuLapte(cafea));
        cafeaCompleta.operatie();
    }
}