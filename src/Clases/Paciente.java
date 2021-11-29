package Clases;

public class Paciente extends Persona {
    protected Integer prioridad;
    protected Integer estado;
    protected Integer turnoRecepcion;
    protected Integer turnoAtencion;

    public Paciente(Integer prioridad, Integer estado, Integer turnoRecepcion, Integer turnoAtencion) {
        this.prioridad = prioridad;
        this.estado = estado;
        this.turnoRecepcion = turnoRecepcion;
        this.turnoAtencion = turnoAtencion;
    }

    public Paciente(String nombre, Integer identificacion, Integer celular, Integer prioridad, Integer estado, Integer turnoRecepcion, Integer turnoAtencion) {
        super(nombre, identificacion, celular);
        this.prioridad = prioridad;
        this.estado = estado;
        this.turnoRecepcion = turnoRecepcion;
        this.turnoAtencion = turnoAtencion;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getTurnoRecepcion() {
        return turnoRecepcion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "prioridad=" + prioridad +
                ", estado=" + estado +
                ", turnoRecepcion=" + turnoRecepcion +
                ", turnoAtencion=" + turnoAtencion +
                ", nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", Celular=" + Celular +
                '}';
    }

    public void setTurnoRecepcion(Integer turnoRecepcion) {
        this.turnoRecepcion = turnoRecepcion;
    }

    public Integer getTurnoAtencion() {
        return turnoAtencion;
    }

    public void setTurnoAtencion(Integer turnoAtencion) {
        this.turnoAtencion = turnoAtencion;
    }
}
