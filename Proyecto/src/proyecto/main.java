/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class main {
      
    

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

   
    
}