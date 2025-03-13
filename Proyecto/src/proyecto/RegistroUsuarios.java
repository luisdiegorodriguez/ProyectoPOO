/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class RegistroUsuarios {
    Usuario[] usuarios = new Usuario[100];
    int contador = 0;

    public void agregarUsuario() {
        if (contador >= usuarios.length) {
            JOptionPane.showMessageDialog(null, "Límite alcanzado.");
            return;
        }
        
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String nickname = JOptionPane.showInputDialog("Nickname:");
        String password = JOptionPane.showInputDialog("Contraseña:");

        for (int i = 0; i < contador; i++) {
            if (usuarios[i].nickname.equals(nickname)) {
                JOptionPane.showMessageDialog(null, "Nickname en uso.");
                return;
            }
        }

        usuarios[contador++] = new Usuario(nombre, apellido, nickname, password);
        JOptionPane.showMessageDialog(null, "Empleado agregado.");
    }

    public void consultarUsuarios() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay empleados.");
            return;
        }
        
        String lista = "Lista de empleados:\n";
        for (int i = 0; i < contador; i++) {
            lista += usuarios[i].nombre + " " + usuarios[i].apellido + " (" + usuarios[i].nickname + ") - " + (usuarios[i].estado ? "Activo" : "Inactivo") + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void eliminarUsuario() {
        String nickname = JOptionPane.showInputDialog("Nickname a eliminar:");
        for (int i = 0; i < contador; i++) {
            if (usuarios[i].nickname.equals(nickname)) {
                usuarios[i] = null;
                JOptionPane.showMessageDialog(null, "Empleado eliminado.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
    }
}