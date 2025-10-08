package adapter;

public class FacturaValidatorSOAPAdapter implements FacturaValidator {

    private ServicioSOAPExterno servicioSOAP;

    public FacturaValidatorSOAPAdapter(ServicioSOAPExterno servicioSOAP) {
        this.servicioSOAP = servicioSOAP;
    }

    @Override
    public boolean validarFactura(Factura factura) {
        System.out.println("Adaptando llamada de REST a SOAP...");
        String xml = convertirAFormatoSOAP(factura);
        String response = servicioSOAP.enviar(xml);
        System.out.println("Recibiendo respuesta del servicio SOAP: " + response);
        return response.contains("VALIDA");
    }

    private String convertirAFormatoSOAP(Factura factura) {
        return "<factura>" +
                "<numero>" + factura.getNumero() + "</numero>" +
                "<fecha>" + factura.getFecha() + "</fecha>" +
                "<valor>" + factura.getValor() + "</valor>" +
                "</factura>";
    }
}
