package decorator;

public class AlmacenadorBase implements Almacenador {

    @Override
    public void guardar(Archivo archivo) {
        System.out.println("AlmacenadorBase: Guardando archivo: " + archivo.getNombre());
    }
}
