package Clases;

public class Doctorr extends Persona {
    protected String horaEntrada;
    protected String horaSalida;
    protected Boolean estado;

    public Doctorr(String horaEntrada, String horaSalida, Boolean estado) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Doctorr(String nombre, Integer identificacion, Integer celular, String horaEntrada, String horaSalida, Boolean estado) {
        super(nombre, identificacion, celular);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void llamadoValoracionInicial(){

    }

    public void llamadoValoracionFinal(){

    }

}
