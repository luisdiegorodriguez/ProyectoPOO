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
public class Cliente {
    private String nombre;
    private String Apellido;
    private String Ciudad;
    private String direccion;
    private boolean activo;
    public Categoria c;
    private String hileraCat;

    public String getHileraCat() {
        return hileraCat;
    }

    public void setHileraCat(String hileraCat) {
        this.hileraCat = hileraCat;
    }
    private String fechaVisita;
    private String horaVisita;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String Apellido, String Ciudad, String direccion, boolean activo, String hileraCat) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.direccion = direccion;
        this.activo = activo;
        this.hileraCat = hileraCat;
    }

    
    
    public Cliente(String nombre, String fechaVisita) {
        this.nombre = nombre;
        this.fechaVisita = fechaVisita;
    }
    
 
    public Cliente(String nombre, String Apellido, String Ciudad, String direccion, boolean activo, Categoria categoria, String fechaVisita, String horaVisita) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.direccion = direccion;
        this.activo = activo;
        this.c = categoria;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
    }

    public Cliente(String nombre, String Apellido, String Ciudad, String direccion, boolean activo, Categoria c) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.direccion = direccion;
        this.activo = activo;
        this.c = c;
    }
    
    
    
    public void llenarDatos() {
        this.nombre = JOptionPane.showInputDialog(null,"Digite el nombre:" );
        this.Apellido = JOptionPane.showInputDialog(null,"Digite el apellido:" );
        this.Ciudad = JOptionPane.showInputDialog(null,"Digite la ciudad:" );
        this.direccion = JOptionPane.showInputDialog(null,"Digite la direccion:" );
        this.activo = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Digite true para activo o false para inactivo:" ));
        this.fechaVisita = JOptionPane.showInputDialog(null,"Digite la fecha de visita:" );
        this.horaVisita = JOptionPane.showInputDialog(null,"Digite la hora de visita:" );
        this.hileraCat = JOptionPane.showInputDialog(null,"Digite la categoria:" );
        Categoria cat = new Categoria();
        c.llenarDatos();
        this.c = cat;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Categoria getC() {
        return c;
    }

    public void setC(Categoria c) {
        this.c = c;
    }

    

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String mostrarDatos() {
        return "Cliente{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Ciudad=" + Ciudad + ", direccion=" + direccion + ", estado=" + activo + ", categoria=" + hileraCat + '}';
    }
    
    
}
