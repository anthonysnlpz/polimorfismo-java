import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Principal {
  private JTable vehiculos;

  public static void main(String[] args) {
    Vehiculo[] vehiculo = new Vehiculo[3];
    vehiculo[0] = new Vehiculo("JAS45", "GT", "Nissan");
    vehiculo[1] = new VehiculoDeportivo(2, 2023, "ASF23", "GTR", "Nissan");
    vehiculo[2] = new VehiculoDeportivo(4, 2020, "EWT02", "Clasico", "Dodge");

    // Crear un DefaultTableModel con las columnas deseadas
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Placa");
    model.addColumn("Modelo");
    model.addColumn("Marca");
    model.addColumn("Numero de puertas");
    model.addColumn("Año");

    // Llenar el modelo de datos con los vehículos
    for (Vehiculo v : vehiculo) {
      model.addRow(v.obtenerDatos());
    }

    // Crear la JTable con el modelo de datos
    JTable vehiculos = new JTable(model);

    // Crear un JScrollPane si los datos exceden el tamaño de la tabla
    JScrollPane scrollPane = new JScrollPane(vehiculos);

    // Crear un JFrame para mostrar la tabla
    JFrame frame = new JFrame("Datos de Vehículos");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(scrollPane); // Agregar la tabla al JFrame
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
  }
}
