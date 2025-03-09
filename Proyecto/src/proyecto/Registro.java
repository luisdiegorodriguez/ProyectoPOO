/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class Registro {
    

    public static void main(String[] args) {
        
        RegistroUsuarios registro = new RegistroUsuarios();
        
        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Agregar\n2. Consultar\n3. Inactivar\n4. Salir");
            switch (opcion) {
                case "1": registro.agregarUsuario(); break;
                case "2": registro.consultarUsuarios(); break;
                case "3": registro.eliminarUsuario(); break;
                case "4": JOptionPane.showMessageDialog(null, "Ha salido del programa.");
                    System.exit(0);
                default: JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}