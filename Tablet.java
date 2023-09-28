public class Tablet extends Dispositiu implements GammaAlta {
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
    public double calcularPreuFinal() {
        return super.calcularPreuFinal();
    }

    @Override
    public boolean isGammaAlta() {
        return calcularPreuFinal() > 900;
    }

    @Override
    public String toString() {
        return super.toString() + ", nombre de polsades: " + polsades;
    }
}
