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
        boolean inArray = false;
        String nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
        String Apellido = JOptionPane.showInputDialog(null,"Digite el apellido:" );
        String Ciudad = JOptionPane.showInputDialog(null,"Digite la ciudad:" );
        String direccion = JOptionPane.showInputDialog(null,"Digite la direccion:" );
        String hileraCat = JOptionPane.showInputDialog(null,"Digite la categoria del cliente:" );

        if (contador < cl.length) { 
            for (int i = 0; i < contador; i++) {
                if (cl[i].getNombre().equals(nombre)) {
                    inArray = true;
                    break;
                }
            }
            if (inArray == false) { 
                Cliente cli = new Cliente(nombre, Apellido, Ciudad, direccion, true, hileraCat);
                cl[contador] = cli;
                contador++;
                JOptionPane.showMessageDialog(null, "Cliente creado");
            } else { 
                JOptionPane.showMessageDialog(null, "No hay espacio para más Clientes.");
            }
        } else { 
            JOptionPane.showMessageDialog(null, "No hay espacio para más Categorías.");
        }
            
    }
    
    public static void desactivarCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que desea borrar:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente que desea borrar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (cl[i].getNombre().equals(nombre) && cl[i].getApellido().equals(apellido) && cl[i].isActivo() == true) {
                cl[i].setActivo(false);
                JOptionPane.showMessageDialog(null, "Cliente desactivado.");
                e = true;
                break;
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado o ya anulado.");
        }
    }
    
    public static void mostrarDatos() {
        int j = contador;
        JOptionPane.showMessageDialog(null, j);
        for (int i = 0; i < j; i++) {
            JOptionPane.showMessageDialog(null, cl[i].mostrarDatos()+"\n");
        }
    }
    
    public static Cliente buscarCliente() {
        Cliente cliente = new Cliente();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que desea buscar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (cl[i].getNombre().equals(nombre) && cl[i].isActivo() == true) {
                cliente = cl[i];
            }
        }
        return cliente;
    }
    public static boolean existeCliente() {
        boolean existe = false;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que desea buscar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (cl[i].getNombre().equals(nombre) && cl[i].isActivo() == true) {
                existe = true;
            }
        }
        return existe;
    }
    
    public static void menuClientes(){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Cliente", "Desactivar Cliente", "Mostrar Datos" , "Salir"};
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
