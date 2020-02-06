package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "partidos")
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(Integer puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public Integer getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(Integer puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
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