public class Tablet extends Dispositiu{
    private int polsades;

    public Tablet(String marca, String model, double preuBase, int polsades) {
        super(marca, model, preuBase);
        this.polsades = polsades;
    }

    public int getPolsades() {
        return polsades;
    }

    public void setPolsades(int polsades) {
        this.polsades = polsades;
    }

    @Override
    public String toString() {
        return super.toString() + ", nombre de polsades: " + polsades;
    }
}
