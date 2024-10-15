package org.example;

public class Calculadora {

    public int sumar(int unNumero, int otroNumero) {
        return unNumero + otroNumero;
    }

    public int restar(int unNumero, int otroNumero) {
        return unNumero - otroNumero;
    }
    public int multiplicar(int unNumero, int otroNumero) {
        return unNumero * otroNumero;
    }
    public int dividir(int unNumero, int otroNumero) {
        if (otroNumero == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return unNumero / otroNumero;
    }
}
