/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author Amada
 */
public class ControlNotasCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Curso curso=new Curso();
    
    curso.agregarEstudiante(new Estudiante("Ana López", "C001", 85));
    curso.agregarEstudiante(new Estudiante("Luis Pérez", "C002", 45));
    curso.agregarEstudiante(new Estudiante("María Gómez", "C003", 78));
    curso.agregarEstudiante(new Estudiante("Carlos Rivas", "C004", 59));
    curso.agregarEstudiante(new Estudiante("Amada Carcamo", "C005", 91));

    
    //calculamos el promedio 
    System.out.println("Promedio del curso: " + curso.calcularPromedio());

    //Mostrar los estudiantes aprobados
    curso.mostrarEstudiantesAprobados();
    }
    
}
