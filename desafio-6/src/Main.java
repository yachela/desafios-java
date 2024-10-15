public class Main {
    public static void main(String[] args) {


        String configuracion1 = ConfiguracionSistema.getInstancia("configuracion1");
        String configuracion2 = ConfiguracionSistema.getInstancia("configuracion2");
        System.out.println(configuracion2 == configuracion1);
    }
}