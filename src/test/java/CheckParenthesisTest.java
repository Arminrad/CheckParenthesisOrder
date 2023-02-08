import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class CheckParenthesisTest {

    Stack<Character> expChar = new Stack<Character>();

    @Test
    public void testCheckParenthesisOrderTrue() {
        char[] inputString = "(((()))(()))".toCharArray();
        boolean wrongOrder = CheckParenthesis.checkParenthesisOrder(inputString, expChar);
        Assertions.assertFalse(wrongOrder);
    }

    @Test
    public void testCheckParenthesisOrderFalse() {
        char[] inputString = "(((()))(()))))".toCharArray();
        boolean wrongOrder = CheckParenthesis.checkParenthesisOrder(inputString, expChar);
        Assertions.assertTrue(wrongOrder);
    }
}