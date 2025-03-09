/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class ClienteFactura {
    public Cliente cliente;
    public static Factura[] facturas = new Factura[100];
    
    public static void generarFactura() {
        int contador = 0;
        if (contador < facturas.length) { 
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String fechaVisita = java.time.LocalDate.now().toString(); 

            Cliente cliente = new Cliente(nombre, fechaVisita);
            Factura factura = new Factura(cliente);

            facturas[contador] = factura;  
            contador++;  

            JOptionPane.showMessageDialog(null, "Factura generada para " + nombre);
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio para más facturas.");
        }
    }

    
    public static void cancelarFactura() {
        int contador = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente para cancelar su factura:");
        boolean encontrada = false;
        for (int i = 0; i < contador; i++) {
            if (facturas[i].cliente.getNombre().equals(nombre) && facturas[i].estaActiva) {
                facturas[i].cancelar();
                JOptionPane.showMessageDialog(null, "Factura del cliente: " + nombre + " anulada.");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            JOptionPane.showMessageDialog(null, "Factura no encontrada o ya anulada para " + nombre);
        }
    }
    
}
