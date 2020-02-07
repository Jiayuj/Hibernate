package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

public class Partidos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo", insertable = false, nullable = false)
    private Integer codigo;

    @Column(name = "equipo_local")
    private String equipoLocal;

    @Column(name = "equipo_visitante")
    private String equipoVisitante;

    @Column(name = "puntos_local")
    private Integer puntosLocal;

    @Column(name = "puntos_visitante")
    private Integer puntosVisitante;

    @Column(name = "temporada")
    private String temporada;

    public Integer getcodigo() {
        return codigo;
    }

    public void setcodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getequipo_local() {
        return equipoLocal;
    }

    public void setequipo_local(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getequipo_visitante() {
        return equipoVisitante;
    }

    public void setequipo_visitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getpuntos_local() {
        return puntosLocal;
    }

    public void setpuntos_local(Integer puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public Integer getpuntos_visitante() {
        return puntosVisitante;
    }

    public void setpuntos_visitante(Integer puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String gettemporada() {
        return temporada;
    }

    public void settemporada(String temporada) {
        this.temporada = temporada;
    }

    public String toString() {
      return "Partidos{codigo=" + codigo + 
        ", equipoLocal=" + equipoLocal + 
        ", equipoVisitante=" + equipoVisitante + 
        ", puntosLocal=" + puntosLocal + 
        ", puntosVisitante=" + puntosVisitante + 
        ", temporada=" + temporada + 
        "}";
    }
}