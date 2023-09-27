public class Dispositiu {
    private String marca;
    private String model;
    private double preuBase;

    public Dispositiu(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    //Metode per calcular el preu final
    public double calcularPreuFinal() {
        return preuBase * 2;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + model + ", Precio Base: " + preuBase;
    }
}
