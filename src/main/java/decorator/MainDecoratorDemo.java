package decorator;

public class MainDecoratorDemo {
    public static void main(String[] args) {
        Archivo archivo = new Archivo("ReporteFinanciero.pdf", 5000);

        Almacenador almacenador = new AlmacenadorCifrado(
                new AlmacenadorComprimido(
                        new AlmacenadorBase()
                )
        );

        System.out.println("=== Guardando archivo con decoradores ===");
        almacenador.guardar(archivo);
    }
}
