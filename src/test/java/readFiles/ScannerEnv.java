package readFiles;

import java.util.Scanner;

public class ScannerEnv {

    Scanner scanner = new Scanner(System.in);
    String environmentScanned;

    public String getEnvironmentScanned() {
        System.out.println("Select environment");
        environmentScanned = scanner.nextLine();
        return environmentScanned;
    }


}
