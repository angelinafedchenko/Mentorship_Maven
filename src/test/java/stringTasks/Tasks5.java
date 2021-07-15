package stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks5 {

    public static void main(String[] args) {

//        Pattern p3 = Pattern.compile("1\\+2\\=3");
        Pattern p3 = Pattern.compile("\\Q1+2=3\\E");
        Matcher m3 = p3.matcher("1+2=3");

        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
        }

        System.out.println("");
    }
}
