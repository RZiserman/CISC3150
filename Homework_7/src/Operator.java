//Author: Roman Ziserman
import java.util.*;

public class Operator {
    private char operator;
    private int inputPrecedence;
    private int stackPrecedence;
    private int rank;

    public Operator(char operator) throws IllegalOperationException {
        switch (operator) {
            case '+':
            case '-':
                this.inputPrecedence = 1;
                this.stackPrecedence = 1;
                this.rank = -1;
                break;
            case 'x':
            case '/':
            case '%':
                this.inputPrecedence = 2;
                this.stackPrecedence = 2;
                this.rank = -1;
                break;
            case '^':
                this.inputPrecedence = 4;
                this.stackPrecedence = 3;
                this.rank = -1;
                break;
            case '(':
                this.inputPrecedence = 5;
                this.stackPrecedence = -1;
                this.rank = 0;
                break;
            case ')':
                this.inputPrecedence = 0;
                this.stackPrecedence = 0;
                this.rank = 0;
                break;
            default:
                throw new IllegalOperationException();
        }
        this.operator = operator;
    }

    public static boolean isOperator(char charToCheck) {
        char[] operatorArray = {'+', '-', 'x', '/', '%', '^', '(', ')'};
        for (char c : operatorArray) {
            if (charToCheck == c) {
                return true;
            }
        }
        return false;
    }

    public double compute(double opOne, double opTwo) throws ArithmeticException{

            switch (this.operator) {
                case '+':
                    return opOne + opTwo;
                case '-':
                    return opTwo - opOne;
                case 'x':
                    return opOne * opTwo;
                case '/':
                    if(opOne == 0){
                        throw new ArithmeticException();
                    }
                    return opTwo / opOne;
                case '%':
                    return opTwo % opOne;
                case '^':
                    return Math.pow(opTwo, opOne);
                default:
                    return 0;
            }
    }

    public int getInputPrecedence() {
        return this.inputPrecedence;
    }

    public int getStackPrecedence() {
        return this.stackPrecedence;
    }

    public int getRank(){
        return this.rank;
    }

    public char getOperator(){
        return this.operator;
    }
}
