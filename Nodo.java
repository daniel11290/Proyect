package mantenimiento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Nodo {

    private final int id;
    private final String solicitante;
    private final String ubicacion;
    private final String descripcion;
    private final int prioridad;
    private final LocalDateTime horaRegistro;
    private Nodo siguiente;

    public Nodo(int id, String solicitante, String ubicacion, String descripcion,
                int prioridad, LocalDateTime horaRegistro) {
        this.id = id;
        this.solicitante = solicitante;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.horaRegistro = horaRegistro;
        this.siguiente = null;
    }

    public int getId() { return id; }
    public String getSolicitante() { return solicitante; }
    public String getUbicacion() { return ubicacion; }
    public String getDescripcion() { return descripcion; }
    public int getPrioridad() { return prioridad; }
    public LocalDateTime getHoraRegistro() { return horaRegistro; }
    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

    public String getNombrePrioridad() {
        switch (prioridad) {
            case 1:  return "Crítica";
            case 2:  return "Alta";
            case 3:  return "Media";
            default: return "Baja";
        }
    }

    @Override
    public String toString() {
        return "#" + id + " | " + getNombrePrioridad() + " | " + solicitante
                + " | " + ubicacion + " | " + descripcion + " | "
                + horaRegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}
