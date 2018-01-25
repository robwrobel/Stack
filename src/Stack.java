import java.lang.reflect.Array;

public class Stack<T> {
    private T[] table;
    int index;
    int size;
    public Stack (Class<T> c, int size) {
        table = (T[]) Array.newInstance(c,size);
        this.size = size;
        this.index = 0;
    }

    T pop() {
        if (index == 0) throw new StackUnderflowException();
        return table[--index];
    }
}
