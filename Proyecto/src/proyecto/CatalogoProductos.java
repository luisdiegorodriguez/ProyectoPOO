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
        boolean inArray = false;
        String nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
        double costo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el costo:" ));
        String hileraCat = JOptionPane.showInputDialog(null,"Digite el nombre de la categoria:" );
        if (contador < p.length) { 
            for (int i = 0; i < contador; i++) {
                if (p[i].getNombre().equals(nombre)) {
                    inArray = true;
                    break;
                }
            }
            if (inArray == false) { 
                Producto pro = new Producto(nombre,true,costo,hileraCat);
                p[contador] = pro;
                contador++;
                JOptionPane.showMessageDialog(null, p[contador].mostrarDatos()+"\n");
            } else { 
                JOptionPane.showMessageDialog(null, "No hay espacio para más productos.");
            }
        } else { 
            JOptionPane.showMessageDialog(null, "No hay espacio para más productos.");
        }
    }
    
    public static void desactivarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea desactivar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (p[i].getNombre().equals(nombre) && p[i].isEstado() == true) {
                p[i].setEstado(false);
                JOptionPane.showMessageDialog(null, "Producto desactivado.");
                e = true;
                break;
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado o ya anulado.");
        }
    }
    
    public static void mostrarDatos() {
        int j = contador;
        for (int i = 0; i < j; i++) {
            JOptionPane.showMessageDialog(null, p[i].mostrarDatos()+"\n");
        }
    }
    
    public static Producto buscarProducto() {
        Producto producto = new Producto();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea buscar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (p[i].getNombre().equals(nombre)) {
                producto = p[i];
            }
        }
        return producto;
    }
    
    public static void menuProductos(){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Producto", "Desactivar Producto", "Mostrar Datos", "Salir"};
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
                    mostrarDatos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
