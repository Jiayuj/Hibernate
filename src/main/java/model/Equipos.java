package model;


public class Equipos {


    private String Nombre;

    private String Ciudad;

    private String Conferencia;

    private String Division;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getConferencia() {
        return Conferencia;
    }

    public void setConferencia(String Conferencia) {
        this.Conferencia = Conferencia;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String Division) {
        this.Division = Division;
    }

    public String toString() {
      return "Equipos{Nombre=" + Nombre + 
        ", Ciudad=" + Ciudad + 
        ", Conferencia=" + Conferencia + 
        ", Division=" + Division + 
        "}";
    }
}