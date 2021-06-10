package readFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ReadProperties {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select environment");
        String environment = scanner.nextLine();

        Properties properties = new Properties();

        String fileName = environment.concat("_env.properties");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try {
            properties.load(classloader.getResourceAsStream(fileName));

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        for(String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            System.out.println(key + " => " + value);
        }


    }


}

