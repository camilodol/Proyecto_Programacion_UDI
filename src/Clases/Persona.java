package Clases;

public class Persona {

    protected String nombre;
    protected Integer identificacion;
    protected Integer Celular;

    public Persona() {

    }

    public Persona(String nombre, Integer identificacion, Integer celular) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        Celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getCelular() {
        return Celular;
    }

    public void setCelular(Integer celular) {
        Celular = celular;
    }
}
