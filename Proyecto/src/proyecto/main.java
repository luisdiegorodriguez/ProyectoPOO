/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

public class main {
   
    public static void main(String[] args) {         
        RegistroUsuarios registro = new RegistroUsuarios();
        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Agregar usuario\n2. Consultar lista de usuarios registrados\n3. Inactivar usuario\n4. Generar o cancelar factura a un usuario\n5. Catalogo de categorias.\n"
                    + "6. Catalogo de Clientes\n7. Catalogo de Productos");
            switch (opcion) {
                case "1": registro.agregarUsuario(); break;
                case "2": registro.consultarUsuarios(); break;
                case "3": registro.eliminarUsuario(); break;
                case "4": ClienteFactura.menuFactura(); break;
                case "5": CatalogoCategorias.menuCategoria(); break;
                case "6": CatalogoClientes.menuClientes(); break;
                case "7": CatalogoProductos.menuProductos(); break;
                case "8": JOptionPane.showMessageDialog(null, "Ha salido del programa.");
                    System.exit(0);
                default: JOptionPane.showMessageDialog(null, "Opción inválida.");
                
                
            }
        }    
        
    }
}