import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    @Test
    public void unaCalculadoraSumaDosNumerosDados() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void unaCalculadoraRestaDosNumerosDados() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(4, 1);
        assertEquals(3, resultado);
    }

    @Test
    public void unaCalculadoraMultiplicaDosNumerosDados() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(2, 2);
        assertEquals(4, resultado);
    }
    @Test
    public void unaCalculadoraDivideDosNumerosDadosYElDividendoNuncaPuedeSerCero() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dividir(2, 2);
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
