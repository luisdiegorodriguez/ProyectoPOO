/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;


public class Categoria {
    private int id;
    private String descripcion;
    private boolean activo = true;

    public void llenarDatos() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id:" ));
        this.descripcion = JOptionPane.showInputDialog(null,"Digite la descripcion:" );
        JOptionPane.showMessageDialog(null, id + ", " + descripcion);
    }

    public Categoria() {
    }
    
    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public String mostrarDatos() {
        return "Categoria{" + "id=" + id + ", descripcion=" + descripcion + ", activo=" + activo + '}';
    }
    
    
}
