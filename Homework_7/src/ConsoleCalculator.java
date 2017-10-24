import java.util.EmptyStackException;

public class ConsoleCalculator{
    public static void main(String[] args) {
        try {
            InfixToPostfixConverter inToPostConverter = new InfixToPostfixConverter();
            PostfixEvaluator.evaluate(inToPostConverter.convert());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Watch those spaces.. Program terminated");
        } catch (TooManyOperandsException e){
            System.out.println("Too many operands");
        } catch (UserIsADumbassException e){
            System.out.println("The user is a dumbass.");
        } catch (ArithmeticException e){
            System.out.println("Just no.");
        } catch (EmptyStackException e){
            System.out.println("And now some stack out there is empty.");
        } catch (LookAtMrAlgebraOverHereException e){
            System.out.println("Numerals only!");
        }
    }
}
