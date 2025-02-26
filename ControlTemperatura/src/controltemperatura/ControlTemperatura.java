/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controltemperatura;

/**
 *
 * @author Amada
 */
public class ControlTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Termometro temp = new Termometro(30);
        
        System.out.println("La temperatura es de: ");
        
        temp.conversionFahrenheit();
        temp.conversionKelvin();
        
        temp.setTemperatura(20);
        System.out.println(" La Nueva temperatura: " );
        temp.conversionFahrenheit();
        temp.conversionKelvin();
        
    }
    
}
