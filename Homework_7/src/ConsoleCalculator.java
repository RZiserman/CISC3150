public class ConsoleCalculator{
    public static void main(String[] args) {
        try {
            InfixToPostfixConverter inToPostConverter = new InfixToPostfixConverter();
            PostfixEvaluator.evaluate(inToPostConverter.convert());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Watch those spaces.. Program terminated");
        }
    }
}
