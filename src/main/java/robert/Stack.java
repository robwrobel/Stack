package robert;
import java.lang.reflect.Array;

/**
 * This is a stack implementation.
 * @param <T>
 */
public class Stack<T> {
    private T[] table;
    int index;
    int size;
    public Stack (Class<T> c, int size) {
        this.table = (T[]) Array.newInstance(c,size);
        this.size = size;
        this.index = 0;
    }

    /**
     * 
     * @return
     */
    T pop() {
        if (index == 0) throw new StackUnderflowException();
        return table[--index];
    }

    void push (T element) {
        if (index >= size) throw new StackOverflowException();
        table[index] = element;
        index++;
    }
}
