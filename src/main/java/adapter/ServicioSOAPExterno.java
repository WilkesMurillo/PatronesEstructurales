package adapter;

public class ServicioSOAPExterno {
    public String enviar(String xml) {
        System.out.println("ServicioSOAPExterno. Enviando XML al servicio SOAP...");
        System.out.println(xml);
        return "<response>VALIDA</response>";
    }
}
