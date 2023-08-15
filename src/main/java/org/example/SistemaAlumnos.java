package org.example;
import java.util.Scanner;

public class SistemaAlumnos {
    public static void main(String[] args) {

        Scanner entradaAlumnos = new Scanner(System.in);
        Scanner entradaCalificaciones = new Scanner(System.in);

        Alumno nombreAlumno = new Alumno();
        System.out.println("Digite el nombre de un alumno ");
        nombreAlumno.nombre = entradaAlumnos.nextLine();

        Alumno calificacionAlumno = new Alumno();
        System.out.println("Digite la calificación ");
        calificacionAlumno.calificaciones = entradaCalificaciones.nextDouble();


        nombreAlumno.mostrarAlumnos();
        calificacionAlumno.mostrarCalificaciones();

    }
}
