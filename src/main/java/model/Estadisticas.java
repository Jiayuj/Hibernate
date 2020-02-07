package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

public class Estadisticas {
    private String temporada;

    private Integer jugador;

    private Float puntosPorPartido;

    private Float asistenciasPorPartido;

    private Float taponesPorPartido;

    private Float rebotesPorPartido;

    public String gettemporada() {
        return temporada;
    }

    public void settemporada(String temporada) {
        this.temporada = temporada;
    }

    public Integer getjugador() {
        return jugador;
    }

    public void setjugador(Integer jugador) {
        this.jugador = jugador;
    }

    public Float getPuntos_por_partido() {
        return puntosPorPartido;
    }

    public void setPuntos_por_partido(Float puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public Float getAsistencias_por_partido() {
        return asistenciasPorPartido;
    }

    public void setAsistencias_por_partido(Float asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public Float getTapones_por_partido() {
        return taponesPorPartido;
    }

    public void setTapones_por_partido(Float taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public Float getRebotes_por_partido() {
        return rebotesPorPartido;
    }

    public void setRebotes_por_partido(Float rebotesPorPartido) {
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