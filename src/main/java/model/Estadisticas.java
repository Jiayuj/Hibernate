package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "estadisticas")
@Entity
public class Estadisticas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "temporada", insertable = false, nullable = false)
    private String temporada;

    @Id
    @Column(name = "jugador", insertable = false, nullable = false)
    private Integer jugador;

    @Column(name = "Puntos_por_partido")
    private Float puntosPorPartido;

    @Column(name = "Asistencias_por_partido")
    private Float asistenciasPorPartido;

    @Column(name = "Tapones_por_partido")
    private Float taponesPorPartido;

    @Column(name = "Rebotes_por_partido")
    private Float rebotesPorPartido;

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Integer getJugador() {
        return jugador;
    }

    public void setJugador(Integer jugador) {
        this.jugador = jugador;
    }

    public Float getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(Float puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public Float getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(Float asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public Float getTaponesPorPartido() {
        return taponesPorPartido;
    }

    public void setTaponesPorPartido(Float taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public Float getRebotesPorPartido() {
        return rebotesPorPartido;
    }

    public void setRebotesPorPartido(Float rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }

    public String toString() {
      return "Estadisticas{temporada=" + temporada + 
        ", jugador=" + jugador + 
        ", puntosPorPartido=" + puntosPorPartido + 
        ", asistenciasPorPartido=" + asistenciasPorPartido + 
        ", taponesPorPartido=" + taponesPorPartido + 
        ", rebotesPorPartido=" + rebotesPorPartido + 
        "}";
    }
}