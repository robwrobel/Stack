import java.lang.reflect.Array;

public class Stack<T> {
    private T[] table;
    
    public Stack (Class<T> c, int size) {
        table = (T[]) Array.newInstance(c,size);
    }
}
