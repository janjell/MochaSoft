package cl.mochasoft.model;

/**
 *
 * @author Jorge A
 */
public class Engine {

    private String id;
    private String nombre;
    private int fk_compania;

    public Engine() {
    }

    public Engine(String id, String nombre, int fk_compania) {
        this.id = id;
        this.nombre = nombre;
        this.fk_compania = fk_compania;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFk_compania() {
        return fk_compania;
    }

    public void setFk_compania(int fk_compania) {
        this.fk_compania = fk_compania;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
