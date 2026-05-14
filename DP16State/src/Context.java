package src;

public class Context {
    private State stare;

    public void setStare(State stare) {  // +setStare(stare:State):void
        this.stare = stare;
    }

    public void request() {
        stare.actiune();
    }
}