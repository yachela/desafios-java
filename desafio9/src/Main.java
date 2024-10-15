public class Main {
    public static void main(String[] args) {

        MiLista nuevaLista = new MiLista<>();
        String palabra = "Hola";

        nuevaLista.agregarElemento(palabra);
        nuevaLista.estaVacia();
        nuevaLista.obtenerElemento(0);

    }
}