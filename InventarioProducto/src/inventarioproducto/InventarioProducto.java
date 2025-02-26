/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventarioproducto;

/**
 *
 * @author Amada
 */
public class InventarioProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto producto1= new Producto("Dell","Laptop", 1200);
       
       System.out.println("Producto registrado:");
       System.out.println("Codigo:"+ producto1.getCodigo());
       System.out.println("Nombre:"+ producto1.getNombre());
       System.out.println("Precio:$"+ producto1.getPrecio());
       
   
      producto1.setPrecio(1300);
      System.out.println("Nuevo precio actualizado:$"+producto1.getPrecio());

      
      System.out.println("Precio final:$"+ producto1.getPrecio());
    }
    
}
