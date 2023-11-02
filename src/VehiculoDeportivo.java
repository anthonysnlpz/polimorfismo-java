import java.util.Vector;

public class VehiculoDeportivo extends Vehiculo {
  private int numeroPuertas;
  private int year;

  public VehiculoDeportivo () {}

  public VehiculoDeportivo (int numeroPuertas, int year, String matricula, String modelo, String marca) {
    super(matricula, modelo, marca);
    this.numeroPuertas = numeroPuertas;
    this.year = year;
  }

  //setters
  public void setNumeroPuertas (int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

  public void setYear (int year) { this.year = year; }

  //getters
  public int getNumeroPuertas () { return numeroPuertas; }
  public int getYear () { return year; }
/*  public String obtenerDatos () {
    return String.format("Vehiculo deportivo: Matricula: %s, Marca: %s, Modelo: %s, Numero puertas: %d, Año: %d", getMatricula(), getMarca(), getModelo(), getNumeroPuertas(), getYear());
  }*/
  public Object[] obtenerDatos() {
    Object[] datos = {getMatricula(), getMarca(), getModelo(), getNumeroPuertas(), getYear()};
    return datos;
  }

}
