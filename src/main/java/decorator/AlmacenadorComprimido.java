package decorator;

public class AlmacenadorComprimido extends AlmacenadorDecorador {

    public AlmacenadorComprimido(Almacenador decorado) {
        super(decorado);
    }

    @Override
    public void guardar(Archivo archivo) {
        System.out.println("Compresión: Comprimiendo archivo antes de guardar...");
        super.guardar(archivo);
        System.out.println("Compresión: decorator Archivo comprimido correctamente.");
    }
}
