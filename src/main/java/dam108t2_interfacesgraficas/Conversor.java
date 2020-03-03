package dam108t2_interfacesgraficas;

public class Conversor {
    Conversor(){}
    
    public static double convertirFarToCel(double far){
        double cel = (far - 32) * 5 / 9;
        return cel;
    }
    
    public static double convertirCelToFar(double cel){
        double far = (cel * 9/5) +32;
        return far;
    }
    
}
