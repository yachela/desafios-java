public interface OperacionLogica {
    boolean operacionLogica(int a, int b);
}
public class MiOperacionLogica implements OperacionLogica{

    @Override
    public boolean operacionLogica(int a, int b) {
        if(a>b){
            return true;
        }
        else {
            return false;
        }
    }
}