import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crea una llista de dispositius
        List<Dispositiu> dispositius = new ArrayList<>();

        // Afegeix 5 dispositius a la llista
        dispositius.add(new Altres("Reloj Inteligente", "Galaxy Watch 3", 100, "El reloj inteligente para hombre y mujer que cuida tu salud."));
        dispositius.add(new Smartphone("Samsung", "Galaxy S23", 300, "Android", false, false));
        dispositius.add(new Smartphone("Apple", "iPhone 13", 500, "iOS", true, true));
        dispositius.add(new Tablet("Lenovo", "Tab M11", 400, 200));
        dispositius.add(new Altres("MarcaZ", "ModeloZ", 200, "Descripción del dispositivo Z"));
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
            System.out.println("Precio base: " + dispositiu.getPreuBase() + ", Precio final: " + dispositiu.calcularPreuFinal());
        }
    }

    private static void mostrarDispositiusDeGammaAlta(List<Dispositiu> dispositius) {
        System.out.println("\nDispositius de Gamma Alta:\n");
        String tipusDispositiu = "";
        for (Dispositiu dispositiu : dispositius) {
            if (dispositiu instanceof GammaAlta && ((GammaAlta) dispositiu).isGammaAlta()) {
                if (dispositiu instanceof Smartphone) {
                    tipusDispositiu = String.valueOf(Smartphone.class);
                } else if (dispositiu instanceof Tablet) {
                    tipusDispositiu = String.valueOf(Tablet.class);
                }
                System.out.println(tipusDispositiu + ": " + dispositiu.calcularPreuFinal() + "€");

            }

        }

    }

}

