public class ConfiguracionSistema {
    private String directorioArchivos;
    private String configuracion;
    private int clave;
    private static String instancia;

    private ConfiguracionSistema(String nombre) {
    instancia = nombre;
    }

    public static String getInstancia(String nombre) {
        if (instancia == null){
            instancia = nombre;
        }else{
            System.out.println("Ya existe la instancia de configuracion");
        }
        return instancia;
    }
}
