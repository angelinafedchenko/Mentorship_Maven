package readFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;



public class ReadPropertiesNew {

    Properties properties;
    Client bob;

    public String scanFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select environment");
        String environment = scanner.nextLine();
        String fileName = environment.concat("_env.properties");
        return fileName;
    }

    public void loadFile() throws IOException {
        String fileName = scanFile();
        properties = new Properties();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try {
            properties.load(classloader.getResourceAsStream(fileName));
            //properties.load(new FileInputStream("./src/main/resources/".concat(fileName)));

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");

        }
    }

    public void readFile() {

        bob = new Client(properties.getProperty("Name"), properties.getProperty("Password"));
//       ==>
//        for (String key : properties.stringPropertyNames()) {
//            String value = properties.getProperty(key);
//            System.out.println(key + " => " + value);
//        }
    }

    //       ==>
//    public String getPassword() {
//        return properties.getProperty("Password");
//    }
//
//    public String getName() {
//        return properties.getProperty("Name");
//    }



    public class Client {

        private String name;
        private String password;

        Client (String name, String password) {
            this.name = name;
            this.password = password;
        }


        public String getName() {
            return name;
        }


        public String getPassword() {
            return password;
        }
    }
}


