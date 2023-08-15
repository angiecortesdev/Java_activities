package org.example;

import java.util.Scanner;

public class tiendaLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        int id = consola.nextInt();
        System.out.println("Proporciona el precio: ");
        double precio = consola.nextDouble();
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioGratuito = consola.hasNext();

        System.out.println(nombre + " #" + id);
        System.out.println("$" + precio);
        System.out.println(envioGratuito);

    }
}
