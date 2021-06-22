package readFiles;

import java.io.IOException;
import java.util.Properties;


public class ReadPropertiesNew {
    String environment;
    String fileName;
    Properties properties;
    ScannerEnv envName;

    static {
        System.out.println("Static block.");
    }

    public ReadPropertiesNew(String environment) {
        fileName = environment.concat("_env.properties");
    }

    public String getName() {
        return properties.getProperty("Name");
    }

    public String getPassword() {
        return properties.getProperty("Password");
    }


    public void loadFile() throws IOException {
        properties = new Properties();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try {
            properties.load(classloader.getResourceAsStream(fileName));
            //properties.load(new FileInputStream("./src/main/resources/".concat(fileName)));

        } catch (Exception e) {
            System.err.println(fileName + " File is not found");

        }

    }


//    public void readFile() {
//
//        //bob = new Client(properties.getProperty("Name"), properties.getProperty("Password"));
////       ==>
////        for (String key : properties.stringPropertyNames()) {
////            String value = properties.getProperty(key);
////            System.out.println(key + " => " + value);
////        }
//    }



//    public class Client {
//
//        private String name;
//        private String password;
//
//        Client (String name, String password) {
//            this.name = name;
//            this.password = password;
//        }
//
//
//        public String getName() {
//            return name;
//        }
//
//
//        public String getPassword() {
//            return password;
//        }
//    }
}


