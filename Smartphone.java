public class Smartphone extends Dispositiu {
    private String sistema;
    private boolean accelerometre=false;
    private boolean gps=true;

    public Smartphone(String marca, String model, double preuBase, String sistema, boolean accelerometre, boolean gps) {
        super(marca, model, preuBase);
        this.sistema = sistema;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    // Getters & Setters
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public double calcularPreuFinal() {
        double preuFinal = super.calcularPreuFinal();
        if (accelerometre) {
            // Incrementar el preu final si te accelerometre en 10 %
            preuFinal = preuFinal * 1.1;
        }
        if (gps) {
            // Incrementar el preu final si te GPS en 5 %
            preuFinal = preuFinal * 1.05;
        }
        return preuFinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sistema Operatiu: " + sistema + ", acceleròmetre: " + accelerometre + ", GPS: "
                + gps;
    }

}