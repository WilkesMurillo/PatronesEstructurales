package adapter;

public class Factura {
    private String numero;
    private String fecha;
    private double valor;

    public Factura(String numero, String fecha, double valor) {
        this.numero = numero;
        this.fecha = fecha;
        this.valor = valor;
    }

    public String getNumero() { return numero; }
    public String getFecha() { return fecha; }
    public double getValor() { return valor; }
}
