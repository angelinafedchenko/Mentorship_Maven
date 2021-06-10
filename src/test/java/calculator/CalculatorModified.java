package calculator;

import java.util.Scanner;

public class CalculatorModified {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        operationResult();

    }

    public static double getNumber(){
        System.out.println("Insert number to be calculated");
        double num;
        if(scanner.hasNextInt()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Try again");
            scanner.next();
            num = getNumber();
        }
        return num;
    }

    public static String getOperation() {
        System.out.println("Choose operation ('+', '-', '*', '/'");
        String operator;
        operator = scanner.next();
        return operator;
    }

    public static void operationResult () {
        double num1 = getNumber();
        double num2 = getNumber();
        switch (getOperation()) {

            case "+":
                System.out.println("= " + (num1 + num2));
                break;
            case "-":
                System.out.println("= " + (num1 - num2));
                break;
            case "*":
                System.out.println("= " + (num1 * num2));
                break;
            case "/":
                System.out.println("= " + (num1 / num2));
                break;
        }

    }
}
