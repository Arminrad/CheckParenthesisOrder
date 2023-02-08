import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean wrongOrder = false;
        Stack<Character> expChar = new Stack<Character>();
        do {
            System.out.println("Enter your mathematical expression: ");
            String input = scanner.nextLine();
            char[] inputString = input.toCharArray();
            wrongOrder = checkParenthesisOrder(inputString, expChar);
        } while (wrongOrder);
    }

    public static boolean checkParenthesisOrder(char[] inputString, Stack<Character> expChar) {
        boolean wrongOrder = false;
        for (char ch : inputString) {
            if (ch == '(') {
                expChar.push(ch);
            } else if (ch == ')' && !expChar.isEmpty()) {
                expChar.pop();
            } else if (ch == ')') {
                System.out.println("Oops! Entered your parenthesis in a bad order!");
                wrongOrder = true;
                break;
            }
        }
        return wrongOrder;
    }
}