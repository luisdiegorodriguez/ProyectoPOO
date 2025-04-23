/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class CatalogoProductos {
    static Producto[] p = new Producto[100];
    static int contador = 0;
    
    public static void generarProducto() {
        if (contador < p.length) { 
            String nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
            double costo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el costo:" ));

            p[contador].setNombre(nombre);
            p[contador].setCosto(costo);
            p[contador].setEstado(true);
            p[contador].setCategoria(CatalogoCategorias.buscarCategoria());
            contador++;
            
            JOptionPane.showMessageDialog(null, "Producto creado para " + nombre);
        } else { 
            JOptionPane.showMessageDialog(null, "No hay espacio para más Productos.");
        }
    }
    
    public static void desactivarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea borrar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (p[i].getNombre().equals(nombre) && p[i].isEstado() == true) {
                p[i].setEstado(false);
                JOptionPane.showMessageDialog(null, "Producto " + nombre + " desactivado.");
                e = true;
                break;
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado o ya anulado.");
        }
    }
    
    public static void menuCategoria(){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Producto", "Desactivar Producto", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "***Productos***", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    generarProducto();
                    break;
                case 1:
                    desactivarProducto();
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
