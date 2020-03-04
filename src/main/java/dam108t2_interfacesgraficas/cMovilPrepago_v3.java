package dam108t2_interfacesgraficas;

public class cMovilPrepago_v3 {
    public long numeroMovil;
    public float costeEstablecLlamada;
    private float costeMinutoLlamada ;
    private float costeConsumoMB;
    private float saldo;

cMovilPrepago_v3 (long nM, float cEL, float cML, float cMB, float s) {
    numeroMovil = nM;
    costeEstablecLlamada = cEL;
    costeMinutoLlamada = cML;
    costeConsumoMB = cMB;
    saldo =s;
}    
public void efectuarLlamada (int segundos) {
        saldo -= costeEstablecLlamada + costeMinutoLlamada /60f * segundos;
        saldo = Math.round(saldo * 100f)/100f;
        if (saldo < 0) saldo = 0;
}
public void navegar (int mb) {
      saldo -= Math.round(costeConsumoMB* mb * 100f) / 100f;
      if (saldo < 0) saldo = 0;
}
public boolean recargar (int importe) {
      if (importe % 5 == 0) {
         saldo += importe;
         return true;
      }
      else return false;
}
public float consultarSaldo () {
      return saldo;
}
} //fin clase