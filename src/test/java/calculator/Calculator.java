package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.println("Insert 2 numbers to be calculated");
        System.out.println("First: ");
        first = scanner.nextDouble();
        System.out.println("Second: ");
        second = scanner.nextDouble();
        System.out.println("Choose operation ('+', '-', '*', '/'");
        operator = scanner.next();


        switch (operator) {

            case "+":
                System.out.println("= " + (first + second));
                break;
            case "-":
                System.out.println("= " + (first - second));
                break;
            case "*":
                System.out.println("= " + (first * second));
                break;
            case "/":
                System.out.println("= " + (first / second));
                break;
        }

        //        String [] array = {"+","-","*","/"};
//        for (String i : array) {
//            System.out.println("= " + (first + second));
//        }

    }
}