public class ValidadorEdad {

    public void validarEdad(int edad) throws EdadInvalidaException {

        assert edad >= 18 : "La edad debe ser mayor o igual a 18";

           if (edad < 18) {
            throw new EdadInvalidaException("La edad ingresada no es válida. Debe ser mayor o igual a 18.");
        }
    }
}