/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class CatalogoClientes {
    static Cliente[] cl = new Cliente[100];
    static int contador = 0;
    
    
    public static void generarCliente() {
        if (contador < cl.length) { 
            String nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
            String Apellido = JOptionPane.showInputDialog(null,"Digite el apellido:" );
            String Ciudad = JOptionPane.showInputDialog(null,"Digite la ciudad:" );
            String direccion = JOptionPane.showInputDialog(null,"Digite la direccion:" );

            cl[contador].setNombre(nombre);
            cl[contador].setApellido(Apellido);
            cl[contador].setCiudad(Ciudad);
            cl[contador].setDireccion(direccion);
            cl[contador].setActivo(true);
            cl[contador].setC(CatalogoCategorias.buscarCategoria());
            contador++;
            
            JOptionPane.showMessageDialog(null, "Cliente creado para " + nombre);
        } else { 
            JOptionPane.showMessageDialog(null, "No hay espacio para más Clientes.");
        }
    }
    
    public static void desactivarCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que desea borrar:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente que desea borrar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (cl[i].getNombre().equals(nombre) && cl[i].getApellido().equals(apellido) && cl[i].isActivo() == true) {
                cl[i].setActivo(false);
                JOptionPane.showMessageDialog(null, "Cliente " + nombre + " desactivado.");
                e = true;
                break;
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado o ya anulado.");
        }
    }
    
    public static void menuCategoria(){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Cliente", "Desactivar Cliente", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "***Clientes***", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    generarCliente();
                    break;
                case 1:
                    desactivarCliente();
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
