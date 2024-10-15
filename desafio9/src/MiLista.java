    import javax.swing.*;
    import java.util.ArrayList;

    public class MiLista<T>{

        private ArrayList<T> unaLista;

        public MiLista() {

            this.unaLista = new ArrayList<T>();
        }

        public ArrayList<T> getUnaLista() {
            return unaLista;
        }

        public void setUnaLista(ArrayList<T> unaLista) {

            this.unaLista = (ArrayList<T>) unaLista;
        }

        public void agregarElemento (T elemento){

            unaLista.add(elemento);
        }

        public T obtenerElemento(int indice){

            return this.getUnaLista().get(indice);
        }
        public void removerElemento (int indice){

            unaLista.remove(indice);
        }

        public boolean estaVacia (){
            return unaLista.isEmpty();
        }
    }






