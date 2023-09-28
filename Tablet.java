public class Tablet extends Dispositiu implements GammaAlta{
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

  public boolean isGammAlta (){
    Double preuFinal = super.calcularPreuFinal();
    if (preuFinal > 900) {
      return true;
    }
    return false;
  }
    @Override
    public String toString() {
        return super.toString() + ", nombre de polsades: " + polsades;
    }
}
