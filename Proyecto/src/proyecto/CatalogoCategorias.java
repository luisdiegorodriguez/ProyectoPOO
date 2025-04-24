/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

public class CatalogoCategorias {
    public static Categoria[] c = new Categoria[100];
    static int contador = 0;
    
    public static void generarCategoria() {
        boolean inArray = false;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la categoria:");
        if (contador < c.length) { 
            for (int i = 0; i < contador; i++) {
                if (c[i].getDescripcion().equals(nombre)) {
                    inArray = true;
                    break;
                }
            }
            if (inArray == false) { 
                Categoria cat = new Categoria(contador,nombre);
                c[contador] = cat;
                contador++;
                JOptionPane.showMessageDialog(null, "Categoria creada"); 
            }else {
                JOptionPane.showMessageDialog(null, "La categoria que escribio ya existe en el sistema.");
            }
        } else { 
            JOptionPane.showMessageDialog(null, "No hay espacio para más Categorías.");
        }
    }
    
    public static void desactivarCategoria() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la categoría que desea borrar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (c[i].getDescripcion().equals(nombre) && c[i].isActivo() == true) {
                c[i].setActivo(false);
                JOptionPane.showMessageDialog(null, "Categoria desactivada.");
                e = true;
                break;
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Categoría no encontrada o ya anulada.");
        }
    }
    
    
    public static Categoria buscarCategoria() {
        Categoria cat = new Categoria();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la categoría que desea buscar:");
        boolean e = false;
        for (int i = 0; i < contador; i++) {
            if (c[i].getDescripcion().equals(nombre) && c[i].isActivo() == true) {
                cat = c[i];
            }
        }
        if (!e) {
            JOptionPane.showMessageDialog(null, "Categoría no encontrada o ya anulada.");
        }
        return cat;
    }
    
    public static void mostrarDatos() {
        int j = contador;
        for (int i = 0; i < j; i++) {
            JOptionPane.showMessageDialog(null, c[i].mostrarDatos()+"\n");
        }
    }
    
    public static void menuCategoria(){
        boolean continuar = true;
        while (continuar) {
           
            String[] opciones = {"Generar Categoria", "Desactivar Categoria","Mostrar Datos", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "***Categorias***", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    generarCategoria();
                    break;
                case 1:
                    desactivarCategoria();
                    break;
                case 2:
                    mostrarDatos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
