import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ValidadorEdad validadorEdad = new ValidadorEdad();

        try {
            int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
            validadorEdad.validarEdad(edadUsuario);
            System.out.println("Edad valida: " + edadUsuario);
        } catch (EdadInvalidaException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un numero valido.");
        }
    }
}