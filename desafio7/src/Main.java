import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        int numero1;
        int numero2;
        boolean divisionOk = false;
        do {
            try {
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                JOptionPane.showMessageDialog(null, "El resultado es: " + miCalculadora.dividir(numero1, numero2));
                divisionOk = true;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "No se puede dividir el numero por cero, intente nuevamente");
            }
        }while(!divisionOk);
    }
}