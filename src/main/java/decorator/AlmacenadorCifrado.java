package decorator;

public class AlmacenadorCifrado extends AlmacenadorDecorador {

    public AlmacenadorCifrado(Almacenador decorado) {
        super(decorado);
    }

    @Override
    public void guardar(Archivo archivo) {
        System.out.println("Cifrado: Cifrando archivo antes de guardar...");
        super.guardar(archivo);
        System.out.println("Cifrado: decorator Archivo cifrado correctamente.");
    }
}
