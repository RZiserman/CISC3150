//Author: Roman Ziserman
import java.util.*;
import java.util.regex.*;

public class InfixToPostfixConverter {
    private String infixExpr;
    private String postfixExpr;
    private Stack<Operator> operatorStack;

    //Default Constructor
    public InfixToPostfixConverter(){
        operatorStack = new Stack<Operator>();
        Scanner stringInput = new Scanner(System.in);
        postfixExpr = new String();
        System.out.println("Enter your expression, separated by spaces: ");
        infixExpr = stringInput.nextLine();
        stringInput.close();
    }
    //arg constructor
    public InfixToPostfixConverter(String infixExpr){
        this.infixExpr = infixExpr;
        postfixExpr = new String();
        operatorStack = new Stack<Operator>();
    }

    //Conversion method
    public String convert() throws LookAtMrAlgebraOverHereException, UserIsADumbassException, TooManyOperandsException {
        int cumulativeRank = 0;
        Scanner stringScanner = new Scanner(infixExpr);
        Operator currentOp;

        stringScanner.useDelimiter(" "); //use space delimiter to tokenize the expression

        //inspect for alphabetic characters (except for x) (DAT REGEX)
        if (stringScanner.findInLine(Pattern.compile("[a-zA-Z&&[^x]]")) != null){
            throw new LookAtMrAlgebraOverHereException();
        }

        while(stringScanner.hasNext()){
            //check if operand. Print if it is.
            if(stringScanner.hasNextInt() || stringScanner.hasNextDouble()){
                this.postfixExpr = this.postfixExpr + stringScanner.next() + " ";
                cumulativeRank = cumulativeRank + 1;

                if (cumulativeRank > 1){
                    throw new TooManyOperandsException(); //too many operands
                }
            } else {
                try{
                    //scanner returns a string, but isOperator scans single characters
                    currentOp = new Operator(stringScanner.next().charAt(0));
                    cumulativeRank = cumulativeRank + currentOp.getRank();

                    if(cumulativeRank < 0){
                        throw new UserIsADumbassException(); //too many operators
                    }

                    //Operator will throw an exception if not an operator
                    opStackManage(currentOp);
                }
                catch (IllegalOperationException e) {
                    System.out.println("No illegal operations allowed!");
                    System.exit(1);
                }
            }
        }
        stringScanner.close();

        //final cumulative rank must be 1, since there should be one more operand than operator e.g. 2+3
        if(cumulativeRank != 1){
            throw new UserIsADumbassException(); //TODO
        }

        while(!operatorStack.empty()){
            writeAndPop();
        }
        return this.postfixExpr;
    }

    //operator stack management method
    private void opStackManage(Operator op){
        if(operatorStack.empty()){
            operatorStack.push(op);
            return;
        }

        //first check if right parenthesis (input precedence 0)
        if (op.getInputPrecedence()==0) {
            do{
                writeAndPop();
            } while(operatorStack.peek().getInputPrecedence()!= 5); //5 is the input precedence of the left parenthesis

            operatorStack.pop(); //pop left parenthesis
            return;
        //if not right parenthesis, compare operator input precedence to stack precedence
        }
        while(!operatorStack.empty() && op.getInputPrecedence() <= operatorStack.peek().getStackPrecedence()){
            writeAndPop();
        }
        operatorStack.push(op);
    }

    //for writing to the postfix expression and popping off the operator stack. This method is used for improving readibility.
    private void writeAndPop(){
        this.postfixExpr = this.postfixExpr + Character.toString(operatorStack.peek().getOperator()) + " ";
        operatorStack.pop();
    }
}
