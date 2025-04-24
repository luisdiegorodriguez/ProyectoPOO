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
public class Producto {
    private String nombre;
    private boolean estado;
    private double costo;
    private Categoria categoria;   
    private String hileraCat;

    public String getHileraCat() {
        return hileraCat;
    }

    public void setHileraCat(String hileraCat) {
        this.hileraCat = hileraCat;
    }

    public Producto() {
    }

    
    public Producto(String nombre, boolean estado, double costo, String hileraCat) {
        this.nombre = nombre;
        this.estado = estado;
        this.costo = costo;
        this.categoria = categoria;
    }
    
    public void llenarDatos() {
        this.nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
        this.costo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el apellido:" ));
        this.estado = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Digite true para activo o false para inactivo:" ));
        this.hileraCat = JOptionPane.showInputDialog(null,"Digite la categoria:" );
        Categoria c = new Categoria();
        c.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id de la categoria:" )));
        c.setDescripcion(hileraCat);
        this.categoria = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String mostrarDatos() {
        return "Producto{" + "nombre=" + nombre + ", estado=" + estado + ", costo=" + costo + ", Categoria=" + hileraCat + '}';
    }

    
    
    
}
