public class InfixToPostfixConverterDriver {
    public static void main(String[] args) {
        InfixToPostfixConverter converter = new InfixToPostfixConverter();
        String postfixString;

        try{
            postfixString = converter.convert();
            System.out.println(postfixString);
        }
        catch (TooManyOperandsException e){
            System.out.println("NO");
        }
        catch (UserIsADumbassException e){
            System.out.println("NO!");
        }
        catch (LookAtMrAlgebraOverHereException e){
            System.out.println("NO!!");
        }
    }
}
