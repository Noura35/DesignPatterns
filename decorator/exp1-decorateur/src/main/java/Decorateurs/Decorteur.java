import composants.Boisson;

public abstract class Decorteur extends Boisson {
    protected Boisson b1;

    public Decorteur(Boisson b1) {
        this.b1 = b1;
    }
}
