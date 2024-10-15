import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println(numeros);
        numeros.remove(2);
        System.out.println(numeros);
        numeros.contains(2);

        //Ejercicio 2

        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> elementosCompu = new ArrayList<>();

        lista1.add("Teclado");
        lista1.add("mouse");
        lista1.add("monitor");
        lista1.add("auriculares");
        lista2.add("disco");
        lista2.add("ram");
        lista2.add("cache");
        lista2.add("registro");

        elementosCompu.addAll(lista1);

        elementosCompu.addAll(lista2);
        System.out.print(elementosCompu.toString());

        //3. Eliminación de Duplicados con Set
        Set<Integer> miSet = new HashSet<>(numeros);
        System.out.print(miSet);
    }
/*


• Convertí la lista números del Ejercicio 1 a un conjunto (Set).
• Imprimí el conjunto para verificar que no haya elementos
duplicados.
     */
}