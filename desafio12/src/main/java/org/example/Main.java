package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.restar(50,10);
        calculadora.sumar(44, 3);
        calculadora.restar(34, 3);
        calculadora.multiplicar(4, 3);
        calculadora.dividir(20, 2);
        calculadora.restar(5, 2);
        calculadora.dividir(2,0);

    }
}