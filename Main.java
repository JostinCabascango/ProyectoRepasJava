import java.util.ArrayList;
import java.util.List;

public class Main implements GammaAlta {
  public static void main(String[] args) {
    // Crea una llista de dispositius
    List<Dispositiu> dispositius = new ArrayList<>();

    // Afegeix 5 dispositius a la llista
    dispositius.add(new Altres("Apple", "Apple Watch 3", 100, "Reloj multiusos"));
    dispositius.add(new Smartphone("Samsung", "S23", 680, "Android", false, false));
    dispositius.add(new Smartphone("Apple", "iPhone 15", 500, "IOS", true, true));
    dispositius.add(new Tablet("Samsung", "Tab 6", 400, 5));
    dispositius.add(new Altres("Samsung", "Galaxy Watch 3", 300, "Reloj para hacer deporte"));
    // Mostra la informació dels dispositius
    mostrarInformacioDispositius(dispositius);
    // Mostra el preu base i el preu final dels dispositius
    mostrarPreuBaseIPreuFinal(dispositius);
    // Mostra els dispositius de gamma alta
    mostrarDispositiusDeGammaAlta(dispositius);

  }

  private static void mostrarInformacioDispositius(List<Dispositiu> dispositius) {
    System.out.println("\nInformació dels dispositius:\n");
    for (Dispositiu dispositiu : dispositius) {
      System.out.println(dispositiu);
    }
  }

  private static void mostrarPreuBaseIPreuFinal(List<Dispositiu> dispositius) {
    System.out.println("\nPreu base y preu final dels dispositius:\n");
    for (Dispositiu dispositiu : dispositius) {
      System.out.println(
        "Precio base: " + dispositiu.getPreuBase() + ", Precio final: " + dispositiu.calcularPreuFinal());
    }

  }

  private static void mostrarDispositiusDeGammaAlta(List<Dispositiu> dispositius) {
    System.out.println("\nDispositius de Gamma Alta:\n");

  }
  private boolean isGammaAlta (float preu) {
    if(dispositivo.getClass().equals("Smartphone")&& preu > 700){
      return true;
    }
    if(dispositivo.getClass().equals("Tablet") && preu > 900){
      return true;
    }
    return false;
  }
}
