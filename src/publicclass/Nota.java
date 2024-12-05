package publicclass;

public class Nota {
        
    private double valor;
    
        public double getvalor() {

        return valor;
}
        public void setValor (double v) {

            if (v>=1 && v<=10) {

                valor=v;

            }        
                
    }

}
