package stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks3 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

}

