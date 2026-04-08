public class ProxySpital implements ISpital{
    private ISpital spital;
    private int nrVizitatori;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void viziteaza(Vizitator vizitator) {

        if(!vizitator.areScrisoare) {
            System.out.println("Nu are scrisoare.");
            return;
        }

        nrVizitatori++;

        if(nrVizitatori >= 3) {
            System.out.println("Vizitatorii primesc echipament.");
            spital.viziteaza(vizitator);
        } else {
            System.out.println("Se asteapta grup de minim 3.");
        }
    }
}
