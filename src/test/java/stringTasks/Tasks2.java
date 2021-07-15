package stringTasks;

import java.util.regex.Pattern;

public class Tasks2 {

    public static void main(String[] args) {

        String input1 = "+12343454556";
        boolean result = input1.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }


        String input2 = "Hello";
        boolean found = Pattern.matches("Hello", input2);
        if(found)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }


}

