package readFiles2;

import java.io.File;

public class Task3 {

    public static void main(String[] args) {

        File myFileDir = new File("File 5.txt");
        if (myFileDir.isDirectory()) {
            System.out.println(myFileDir.getAbsolutePath() + " is a directory.\n");
        } else {
            System.out.println(myFileDir.getAbsolutePath() + " is not a directory.\n");
        }

        if (myFileDir.isFile()) {
            System.out.println(myFileDir.getAbsolutePath() + " is a file.\n");
        } else {
            System.out.println(myFileDir.getAbsolutePath() + " is not a file.\n");
        }
    }
    }

