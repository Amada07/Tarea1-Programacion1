/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarioproducto;

/**
 *
 * @author Amada
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
   public Producto(String codigo,String nombre,double precio){
      this.codigo = codigo;
      this.nombre = nombre;
      setPrecio(precio);
 }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        if (precio >= 0){
            this.precio = precio;
        }else{
            System.err.println("Error:El precio no puede ser negativo ");
    }
 
    }
}
