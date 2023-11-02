import java.util.Vector;

public class Vehiculo {

  private String matricula;
  private String modelo;
  private String marca;

  public Vehiculo () {}

  public Vehiculo (String matricula, String modelo, String marca) {
    this.matricula = matricula;
    this.modelo = modelo;
    this.marca = marca;
  }
  //setters
  public void setMatricula (String matricula) { this.matricula = matricula; }

  public void setModelo (String modlo) { this.modelo = modlo; }
  public void setMarca (String marca) { this.marca = marca; }

  //getters
  public String getMatricula () { return matricula; }

  public String getModelo () { return modelo; }

  public String getMarca () { return marca; }

/*  public String obtenerDatos () {
    return String.format("Vehiculo: Matricula: %s, Marca: %s, Modelo: %s", getMatricula(), getMarca(), getModelo());
  }*/
public Object[] obtenerDatos() {
  Object[] datos = {getMatricula(), getMarca(), getModelo()};
  return datos;
}


}
