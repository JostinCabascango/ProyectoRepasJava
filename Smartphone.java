//Classe smatrtphone
public class Smartphone extends Dispositiu{
  String sistema = "";
  boolean accelerador = false; 
  boolean gps = true; 
}
public Smartphone( String sistema_operatiu, boolean accelerometre, boolean gps) {
  this.sistema_operatiu = sistema_operatiu;
  this.accelerometre = false;
  this.gps = true;
}
