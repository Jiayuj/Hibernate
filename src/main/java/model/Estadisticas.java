package model;

import javax.persistence.Id;


import java.io.Serializable;
import java.util.Objects;

public class Estadisticas implements Serializable {
    @Id
    private String temporada;
    @Id
    private int jugador;
    private Double puntosPorPartido;
    private Double asistenciasPorPartido;
    private Double taponesPorPartido;
    private Double rebotesPorPartido;

    private Jugadores jugadoresByJugador;

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public Double getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(Double puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public Double getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(Double asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public Double getTaponesPorPartido() {
        return taponesPorPartido;
    }

    public void setTaponesPorPartido(Double taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public Double getRebotesPorPartido() {
        return rebotesPorPartido;
    }

    public void setRebotesPorPartido(Double rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }



    @Override
    public int hashCode() {
        return Objects.hash(temporada, jugador, puntosPorPartido, asistenciasPorPartido, taponesPorPartido, rebotesPorPartido);
    }

    public Jugadores getJugadoresByJugador() {
        return jugadoresByJugador;
    }

    public void setJugadoresByJugador(Jugadores jugadoresByJugador) {
        this.jugadoresByJugador = jugadoresByJugador;
    }

    @Override
    public String toString() {
        return "EstadisticasEntity{" +
                "temporada='" + temporada + '\'' +
                ", jugador=" + jugador +
                ", puntosPorPartido=" + puntosPorPartido +
                ", asistenciasPorPartido=" + asistenciasPorPartido +
                ", taponesPorPartido=" + taponesPorPartido +
                ", rebotesPorPartido=" + rebotesPorPartido +
                ", jugadoresByJugador=" + jugadoresByJugador +
                '}' + "\n";
    }
}