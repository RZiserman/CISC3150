import java.util.EmptyStackException;

public class PostFixEvaluatorDriver {
    public static void main(String[] args) {
        try {
            PostfixEvaluator.evaluate("2 3 6 x 2 / + 1 - ");
        } catch (EmptyStackException e){
            System.out.println("Now a stack is empty. Good job.");
        }

    }
}
