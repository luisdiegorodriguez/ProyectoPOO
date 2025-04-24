/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class ClienteFactura {
   public static Factura[] facturas = new Factura[100];  
   private static int contador = 0; 

    public static void menuFactura (){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Factura", "Cancelar Factura", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "***Sistema de Facturación***", 
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
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void generarFactura() {  
        Producto prod[] = new Producto[20];
        if (CatalogoClientes.existeCliente() == true){
            if (contador < facturas.length) { 
                Cliente cliente = new Cliente();
                
                cliente = CatalogoClientes.buscarCliente();
                Factura factura = new Factura(cliente);
                for (int i = 0; i < 2; i++) {
                    CatalogoProductos.generarProducto();

                }
                
                facturas[contador] = factura;  
                contador++;  

                JOptionPane.showMessageDialog(null, "Factura generada");
            } else {
                JOptionPane.showMessageDialog(null, "No hay espacio para más facturas.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no esta registrado. Por favor registrar al cliente.");
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
            JOptionPane.showMessageDialog(null, "Factura no encontrada o ya anulada para el cliente: " + nombre);
        }
    }
}
