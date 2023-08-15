package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Llamamos a Scanner
        Scanner input = new Scanner(System.in);

        //1. Registro de Alumnos:
        //Crea una clase Alumno con propiedades como nombre, edad y calificaciones.
        // Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio
        // de sus calificaciones y mostrar la información de cada alumno.




        //3.Calculadora Simple:
        //Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas, como suma, resta, multiplicación y división.
        //CALCULADORA
        Calculadora operaciones = new Calculadora();
        //Se le pide al usuario que digite los números.
        System.out.println("Digite un número");
        operaciones.num1 = input.nextDouble();
        //Se le pide al usuario que digite los números.
        System.out.println("Digite el segundo número");
        operaciones.num2 = input.nextDouble();

        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();



        //4. SISTEMA DE RESERVA DE HOTEL:

        //Crear un sistema de reservas de hotel que permita a los clientes corporativos reservar múltiples habitaciones en diferentes hoteles para hospedar a su personal. Debes tener clases como Hotel, Habitación, Cliente, y Reserva. Implementa métodos para listar habitaciones disponibles, realizar reservas y cancelar reservas. Al final de la ejecución del programa debe mostrar la siguiente info:
        //Nombre de la empresa que reservó
        //Nombre y cédula de quien ocupará cada habitación y número de la habitación que ocupará. Esto para cada hotel.





    }
}