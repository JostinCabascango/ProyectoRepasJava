import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositiu> dispositius=new ArrayList<>();
        dispositius.add(new Altres("Apple", "Apple Watch 3", 100, "Reloj para empresarios"));
        dispositius.add(new Smartphone("Samsung", "S23", 680,"Android",false,false));
        dispositius.add(new Smartphone("Apple", "iPhone 15", 500,"IOS",true,true));
        dispositius.add(new Tablet("Samsung", "Tab 6", 400, 5));
        dispositius.add(new Altres("Samsung", "Galaxy Watch 3", 300, "Reloj para hacer deporte"));

        for(Dispositiu dispositiu:dispositius){
            System.out.println(dispositiu);
        }
    }

}