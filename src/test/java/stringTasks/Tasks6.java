package stringTasks;

import java.util.Scanner;

public class Tasks6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Type your file");

        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("It's Jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("It's HTML-page");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("It's Word");
        }
        else
        {
            System.out.println("Unknown format");
        }
    }
}
