package src.procesatorPlati.adapterobiecte;

public class PlataAdapter implements PlataProcessorRon {
    SistemBancarEuro sistemBancarEuro;

    public PlataAdapter(SistemBancarEuro sistemBancarEuro) {
        this.sistemBancarEuro = sistemBancarEuro;
    }

    @Override
    public double proceseazaPlataRon(double sumaRon) throws Exception {
        if (sumaRon >= 5) {
            sumaRon = sumaRon / 5;
            return sistemBancarEuro.proceseazaPlataEuro(sumaRon);
        } else {
            throw new Exception("Suma in Ron este sub 5 lei");
        }
    }
}
