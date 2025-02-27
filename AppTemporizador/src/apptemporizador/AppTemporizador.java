/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apptemporizador;

/**
 *
 * @author Amada
 */
public class AppTemporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Temporizador temporizador = new Temporizador();
       
       Alarma alarma= new Alarma(5);
       
       temporizador.setAlarma(alarma);
       
       temporizador.iniciar(10);
    }
    
}
