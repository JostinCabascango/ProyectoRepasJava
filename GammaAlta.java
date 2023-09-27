public interface GammaAlta{
String dispositiu = dispositivo.getClass();
public boolean isGammaAlta(float preu){

if(dispositivo.getClass().equals("Smartphone")&& preu > 700){
return true;
}
if(dispositivo.getClass().equals("Tablet") && preu > 900){
return true;
}

return false;
}


}
