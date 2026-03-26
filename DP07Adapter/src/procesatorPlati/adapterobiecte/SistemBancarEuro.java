package src.procesatorPlati.adapterobiecte;

import java.util.concurrent.ExecutionException;

public class SistemBancarEuro {

    public double proceseazaPlataEuro(double suma) throws Exception {
        if(suma < 10000) {
            return suma;
        } else {
            throw new Exception("Suma este mai mare de 10000!");
        }
    }
}
