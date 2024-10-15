    import javax.swing.*;

    public class Calculadora {

        public double dividir(int num1, int num2) {
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
               }
            return (num1/ num2);
        }
    }
