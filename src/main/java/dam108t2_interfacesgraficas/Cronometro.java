package dam108t2_interfacesgraficas;

public class Cronometro extends Thread {
   public int decimas;
   public int segundos;
   public int minutos;
   public boolean arrancado;
   
   Cronometro () {
       Resetear();
   }

   
   public void Resetear(){
      decimas=0;
      segundos=0;
      minutos=0;
      arrancado = false;
   } 
   public void Arrancar (){
      arrancado=true;
   }
   public void Parar (){
      arrancado = false;
   }
   
   public void Incrementar () {
       if (arrancado) {
            decimas++;
            if (decimas==10) {decimas=0;segundos++;}
            else return;
            if (segundos ==60) {segundos=0;minutos++;}
        }
   }   
   
       @Override
    public String toString() {
        if(minutos<10 && segundos < 10){
            return "0"+minutos + ":0" + segundos  + "," + decimas ;
        }
        else if(minutos < 10 && segundos > 9){
            return "0"+minutos + ":" + segundos  + "," + decimas ;
        }
        else if (minutos > 9 && segundos > 9) return minutos + ":" + segundos  + "," + decimas ;
        else return minutos + ":" + segundos  + "," + decimas ;
    }
}