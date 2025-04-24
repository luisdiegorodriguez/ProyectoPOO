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
public class Factura {
    Cliente cliente;
    
    boolean estaActiva;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.estaActiva = true; 
    }

    public void cancelar() {
        this.estaActiva = false; 
    }
    
    public void llenarDatos() {
        this.estaActiva = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Digite true para activo o false para inactivo:" ));
        Cliente c = new Cliente();
        c.llenarDatos();
        this.cliente = c;
    }
    
    
}
