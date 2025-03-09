/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class Usuario {
 String nombre, apellido, nickname, password;
    boolean estado = true;

    public Usuario(String nombre, String apellido, String nickname, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.password = password;
    }

    public void inactivar() {
        estado = false;
    }

    public void imprimirUsuario() {
        JOptionPane.showMessageDialog(null, nombre + " " + apellido + " (" + nickname + ") - " + (estado ? "Activo" : "Inactivo"));
    }
}
