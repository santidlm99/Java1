package Basededatos.Factura;

public class Factura {
    
    private int numero;
    private String concepto;
    private double importe;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public Double getImporte() {
        return importe;
    }
    public void setImporte(Double importe) {
        this.importe = importe;
    }
    public Factura(int numero, String concepto, double importe) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
    }
    public Factura(int numero) {
        this.numero = numero;
    }
    
}
    
   

