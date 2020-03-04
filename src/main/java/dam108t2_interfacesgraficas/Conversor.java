package dam108t2_interfacesgraficas;
import java.util.*;

public class Conversor {
    Conversor(){}
    
    public static double convertirFarToCel(double far){
        double cel = Math.round(( (far - 32) * 0.56 )*100)/100d;
        return cel;
    }
    
    public static double convertirCelToFar(double cel){
        double far = Math.round((cel * 1.8 + 32)*100)/100d;
        return far;
    }
    
}
