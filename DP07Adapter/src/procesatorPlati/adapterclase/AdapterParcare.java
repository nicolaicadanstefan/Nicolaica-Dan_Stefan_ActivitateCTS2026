package src.procesatorPlati.adapterclase;

public class AdapterParcare extends MasinaParcare implements VehiculParcare {
    double taxa;
    double ore;

    public AdapterParcare(double ore, double taxa) {
        this.ore = ore;
        this.taxa = taxa;
    }

    @Override
    public double getTarifOrar() throws Exception {
        double tarifOrar = calculeazaTarifOrar(this.taxa, this.ore);
        if(tarifOrar >= 0) {
            return tarifOrar;
        } else {
            throw new Exception("Tariful orar nu poate fi negativ!");
        }
    }

    @Override
    public double getTarifZilnic() throws Exception {
        double tarifZilnic = 24 * getTarifOrar() * 0.80;
        if(tarifZilnic <= 500){
            return tarifZilnic;
        } else {
            throw new ParcareException("Tariful zilnic nu poate depasi 500 RON!");
        }
    }
}