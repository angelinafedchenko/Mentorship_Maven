package readFiles;

import java.io.IOException;


public class RunProperties {
    public static void main(String[] args) throws IOException {

        String envName = new ScannerEnv().getEnvironmentScanned();

        ReadPropertiesNew testProperies =  new ReadPropertiesNew(envName);

        testProperies.loadFile();
        System.out.println("Client name: " + testProperies.getName());
        System.out.println("Client password: " + testProperies.getPassword());

//        testProperies.readFile();

//        ReadPropertiesNew.Client bob = testProperies.bob;
//        System.out.println("Client name: " + bob.getName());
//        System.out.println("Client password: " + bob.getPassword());

    }
}
