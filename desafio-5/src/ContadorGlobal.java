public class ContadorGlobal implements Contador {
    static int contador = 0;

    public ContadorGlobal() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public void incrementar() {
        contador++;
    }
    @Override
    public void mostrarContador() {
        System.out.println(contador);
    }
}
