package org.example;


public class Calculadora {
    double num1;
    double num2;

    public void sumar(){
        double resultadoSuma = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }

    public void restar(){
        double resultadoResta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }

    public void multiplicar(){
        double resultadoMultiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
    }

    public void dividir(){
        double resultadoDivision = num1 / num2;
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
}
