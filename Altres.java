public class Altres extends Dispositiu {
    private String descripcio;

    public Altres(String marca, String model, double preuBase, String descripcio) {
        super(marca, model, preuBase);
        this.descripcio = descripcio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Descripció: " + descripcio;
    }

}
