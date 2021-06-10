package readFiles;

import gnu.cajo.invoke.Client;

import java.io.IOException;

public class RunProperties {
    public static void main(String[] args) throws IOException {

        ReadPropertiesNew testProperies =  new ReadPropertiesNew();

        testProperies.loadFile();

//        System.out.println(testProperies.getName());
//        System.out.println(testProperies.getPassword());

        testProperies.readFile();

        ReadPropertiesNew.Client bob = testProperies.bob;
        System.out.println("Client name: " + bob.getName());
        System.out.println("Client password: " + bob.getPassword());

    }
}
