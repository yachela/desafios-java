public class Main {
    public static void main(String[] args) {
        //Variables
        Suma sumar = new Suma();
        Resta restar = new Resta();
        Persona maria = new Persona("Maria", 23);
        ContadorGlobal contador = new ContadorGlobal();
        ContadorGlobal contador2 = new ContadorGlobal();
        ContadorGlobal contador3 = new ContadorGlobal();
        ContadorGlobal contador4 = new ContadorGlobal();
        Concatenador unConcatenador = new Concatenador();
        MiOperacionLogica unaOperacion = new MiOperacionLogica();


        //Operaciones
        int miSuma = sumar.sumar(10, 20);
        int miResta = sumar.restar(10, 20);
        maria.presentarInformacion();
        System.out.println(ContadorGlobal.getContador());
        System.out.println(unConcatenador.unirCadenas("Hola", ", soy Lali"));

        for (int i = 0; i < 10 ; i++) {
            int miVariable = sumar.sumar(10, 20);
            if (unaOperacion.operacionLogica(miVariable, 20)){
                i = 10;
            }

        }

           }
}