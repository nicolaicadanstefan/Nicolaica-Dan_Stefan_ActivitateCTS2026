public class Spital implements ISpital{

    @Override
    public void viziteaza(Vizitator vizitator) {
        System.out.println(vizitator.getNume() + " a intrat in salon!");
    }
}
