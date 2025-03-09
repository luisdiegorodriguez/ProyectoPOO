/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class main {
    private static Factura[] facturas = new Factura[100];  
    private static int contador = 0; 

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Factura", "Cancelar Factura",  "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Sistema de Facturación", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    generarFactura();
                    break;
                case 1:
                    cancelarFactura();
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
    }

   
    public static void generarFactura() {
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