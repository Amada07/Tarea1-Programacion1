/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptemporizador;

/**
 *
 * @author Amada
 */
public class Alarma {
    private int tiempoObjetivo;
    
    public Alarma(int tiempoObjetivo){
        this.tiempoObjetivo = tiempoObjetivo;
    }
public int getTiempoObjetivo(){
    return tiempoObjetivo;
}

public void activar(){
    System.out.println("Alarma Activada "+tiempoObjetivo+"segundos.");
 }
}
