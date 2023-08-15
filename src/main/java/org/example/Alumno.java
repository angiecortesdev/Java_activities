package org.example;

public class Alumno {

    String nombre;
    int edad;
    double calificaciones;

    public void mostrarCalificaciones(){
        double promedioCalificaciones = calificaciones * 0.10;
        for(int i = 0; i<=4; i++){
            System.out.println("Promedio: "+ promedioCalificaciones );
        }

    }
    public void mostrarAlumnos(){

    }

}
