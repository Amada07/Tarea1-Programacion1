/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptemporizador;

/**
 *
 * @author Amada
 */
public class Temporizador {
    private int tiempoActual;
    private Alarma alarma;
    
    public Temporizador(){
        this.tiempoActual=0;
    }
    
    public void setAlarma(Alarma alarma){
        this.alarma= alarma;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }
    
    public void iniciar(int duracion){
        System.out.println("Temporizador iniciado");
        
    for (int i = 1; i <= duracion; i++) {
            tiempoActual = i;
            System.out.println("Tiempo: " + tiempoActual + " segundos");
            
             if (alarma != null && tiempoActual == alarma.getTiempoObjetivo()) {
                alarma.activar();
             }
            try {
                Thread.sleep(1000); // Simula el paso del tiempo (1 segundo)
            } catch (InterruptedException e) {
                System.err.println("Error en el temporizador.");
            }
        }

        System.out.println(" Temporizador finalizado.");
    } 
  }

