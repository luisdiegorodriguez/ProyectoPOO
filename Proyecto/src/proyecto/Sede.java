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
public class Sede {
    private String nombre;
    private String direccion;
    private int telefono;

    public Sede(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Sede() {
    }

    public void llenarDatos() {
        this.nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
        this.direccion = JOptionPane.showInputDialog(null,"Digite la direccion" );
        this.telefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nombre:" ));
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
