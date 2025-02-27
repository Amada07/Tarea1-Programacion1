/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotascurso;

import java.util.ArrayList;

/**
 *
 * @author Amada
 */
public class Curso {
   private ArrayList<Estudiante> estudiantes; // Lista de estudiantes

    // Constructor
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para calcular el promedio del curso
    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el curso.");
            return 0.0;
        }

        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.getNotaFinal();
        }

        return sumaNotas / estudiantes.size();
    }

    // Método para obtener los estudiantes que aprobaron
    public void mostrarEstudiantesAprobados() {
        System.out.println("\nEstudiantes que aprobaron:");
        for (Estudiante e : estudiantes) {
            if (e.aprobo()) {
                System.out.println(e.getNombre() + " (" + e.getCarnet() + ") - Nota: " + e.getNotaFinal());
            }
        }
    }
}

