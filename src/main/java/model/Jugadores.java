package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "jugadores")
@Entity
public class Jugadores implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo", insertable = false, nullable = false)
    private Integer codigo;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Procedencia")
    private String Procedencia;

    @Column(name = "Altura")
    private String Altura;

    @Column(name = "Peso")
    private Integer Peso;

    @Column(name = "Posicion")
    private String Posicion;

    @Column(name = "Nombre_equipo")
    private String nombreEquipo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String toString() {
      return "Jugadores{codigo=" + codigo + 
        ", Nombre=" + Nombre + 
        ", Procedencia=" + Procedencia + 
        ", Altura=" + Altura + 
        ", Peso=" + Peso + 
        ", Posicion=" + Posicion + 
        ", nombreEquipo=" + nombreEquipo + 
        "}";
    }
}