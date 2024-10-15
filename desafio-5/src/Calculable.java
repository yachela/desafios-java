public interface Calculable {
int calcular(int valor);

    public class Main {
        public static void main(String[] args) {
            int resultadoFueraDelBloque;
            {
                Calculable calculable = (int valor) -> valor * 2;

                int resultadoDentroDelBloque = calculable.calcular(5);

                System.out.println("Resultado dentro del bloque: " + resultadoDentroDelBloque);

                resultadoFueraDelBloque = resultadoDentroDelBloque;
            }
            System.out.println("Resultado fuera del bloque: " + resultadoFueraDelBloque);
        }
    }
}



