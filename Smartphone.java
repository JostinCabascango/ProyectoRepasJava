public class Smartphone {

    private String marca;
    private String model;
    private float preu_base;
    private String sistema_operatiu;
    private boolean accelerometre;
    private boolean gps;

    Smartphone() {

    }

    // Constructor


    public Smartphone(String marca, String model, float preu_base, String sistema_operatiu, boolean accelerometre, boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preu_base = preu_base;
        this.sistema_operatiu = sistema_operatiu;
        this.accelerometre = false;
        this.gps = true;
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

    public float getPreu_base() {
        return preu_base;
    }

    public void setPreu_base(float preu_base) {
        this.preu_base = preu_base;
    }

    public String getSistema_operatiu() {
        return sistema_operatiu;
    }

    public void setSistema_operatiu(String sistema_operatiu) {
        this.sistema_operatiu = sistema_operatiu;
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
    public String toString() {
        return "Smartphone{" + "marca='" + marca + '\'' + ", model='" + model + '\'' + ", preu_base=" + preu_base + ", sistema_operatiu='" + sistema_operatiu + '\'' + ", accelerometre=" + accelerometre + ", gps=" + gps + '}';
    }
}