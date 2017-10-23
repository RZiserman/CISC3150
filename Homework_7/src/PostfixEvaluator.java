//Author: Roman Ziserman
//This class has a single static method for the sole purpose of evaluating a postfix expression.

import java.util.*;

public class PostfixEvaluator {
    static public void evaluate(String postfixString){
        Scanner stringScanner = new Scanner(postfixString);
        Stack<Double> operandStack = new Stack<Double>();
        Operator currentOperator;

        stringScanner.useDelimiter(" ");

        while(stringScanner.hasNext()){
            if(stringScanner.hasNextDouble()){
                operandStack.push(stringScanner.nextDouble());
            } else {
                try {
                    currentOperator = new Operator(stringScanner.next().charAt(0));
                    operandStack.push(currentOperator.compute(operandStack.pop(), operandStack.pop()));
                } catch (ArithmeticException e){
                    System.out.println("Stop trying to divide by zero.");
                } catch (IllegalOperationException e){
                    System.out.println("Only legal operations allowed!");
                }
            }
        }

        stringScanner.close();
        System.out.println(operandStack.pop());
    }
}
