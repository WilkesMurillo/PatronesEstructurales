package decorator;

public abstract class AlmacenadorDecorador implements Almacenador {

    protected Almacenador decorado;

    public AlmacenadorDecorador(Almacenador decorado) {
        this.decorado = decorado;
    }

    @Override
    public void guardar(Archivo archivo) {
        decorado.guardar(archivo);
    }
}
