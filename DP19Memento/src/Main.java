package src;

public class Main {
    public static void main(String[] args) {
        Originator editor = new Originator();
        ManagerStari manager = new ManagerStari();

        editor.setStare("Versiunea 1");
        manager.adaugaMemento(editor.creareMemento());

        editor.setStare("Versiunea 2");
        manager.adaugaMemento(editor.creareMemento());

        editor.setStare("Versiunea 3");
        manager.adaugaMemento(editor.creareMemento());

        editor.setMemento(manager.getMemento(0));

        editor.setMemento(manager.getMemento(1));
    }
}