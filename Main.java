import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear los dispositivos
        List<Dispositiu> dispositivos = new ArrayList<>();

        // Crear dispositivos
        dispositivos.add(new Altres("Reloj Inteligente", "Galaxy Watch 3", 100, "El reloj inteligente para hombre y mujer que cuida tu salud."));
        dispositivos.add(new Smartphone("Samsung", "Galaxy S23", 300, "Android", false, false));
        dispositivos.add(new Smartphone("Apple", "iPhone 13", 500, "iOS", true, true));
        dispositivos.add(new Tablet("Lenovo", "Tab M11", 400, 200));
        dispositivos.add(new Altres("MarcaZ", "ModeloZ", 200, "Descripción del dispositivo Z"));

        // Mostrar dispositivos
        for (Dispositiu dispositivo : dispositivos) {
            System.out.println(dispositivo.getClass());
        }

    }
}


