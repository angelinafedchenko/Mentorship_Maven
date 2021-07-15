package readFiles2;

import java.io.File;

public class Task2 {

    public static void main(String[] args) {

        File my_file_dir = new File("File 3.txt");

        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.\n");
        }
        else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
    }

