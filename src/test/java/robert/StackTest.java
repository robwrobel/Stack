package robert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void given_StackOfIntegers_when_PushingValue_then_ExpectPopingValueIsTheSame() {
        Stack<Integer> stack = new Stack<>(Integer.class,2);
        Integer expectedValue = 1;
        stack.push(expectedValue);
        Integer actualValue = stack.pop();
        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = StackOverflowException.class)
    public void given_StackOfStrings_when_PushingTooMuchValues_then_ExpectExceptionIsThrown() {
        Stack<String> stack = new Stack<>(String.class,2);
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
    }

    @Test(expected = StackUnderflowException.class)
    public void given_StackOfDoubles_when_PopingFromEmptyStack_then_ExpectExceptionIsThrown() {
        Stack<Double> stack = new Stack<>(Double.class,2);
        stack.pop();
    }
}
