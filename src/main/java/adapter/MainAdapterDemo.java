package adapter;

public class MainAdapterDemo {
    public static void main(String[] args) {
        Factura factura = new Factura("F001", "2025-10-07", 250000.0);
        ServicioSOAPExterno servicioSOAP = new ServicioSOAPExterno();
        FacturaValidator validador = new FacturaValidatorSOAPAdapter(servicioSOAP);

        System.out.println("=== Validando factura mediante Adapter ===");
        boolean valida = validador.validarFactura(factura);
        System.out.println("¿adapter.Factura válida? " + (valida ? "Sí" : "No"));
    }
}
