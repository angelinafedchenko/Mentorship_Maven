package readFiles2;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\afedc\\Desktop\\TestFolder");
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
        }

        File file = new File("C:\\Users\\afedc\\Desktop\\TestFolder\\1.txt");
        String directory = file.getParent();
        System.out.println(directory);
    }
}
