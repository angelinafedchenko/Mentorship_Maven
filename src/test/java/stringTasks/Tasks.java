package stringTasks;

public class Tasks {

    public void getByIndex() {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 is " + (char) index1);
        System.out.println("The character at position 10 is " + (char) index2);
    }

    public void getUnitCode() {
        String str = "Hello";
        System.out.println("Original String : " + str);

        int val1 = str.codePointAt(1);

        int val2 = str.codePointAt(4);

        System.out.println("Character 2 (unicode point) = " + val1);
        System.out.println("Character 5 (unicode point) = " + val2);
    }

    public void concatStrings() {
        String str1 = "Hello Harry and ";
        String str2 = "Sirius";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);
    }

    public void compareSequence() {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));

    }

public void compareObjects() {
    String color1 = "White color";
    String color2 = "Black color";
    String color3 = "White color";

    boolean equals1 = color1.equals(color2);
    boolean equals2 = color1.equals(color3);

    System.out.println("\"" + color1 + "\" equals \"" +
            color2 + "\"? " + equals1);
    System.out.println("\"" + color1 + "\" equals \"" +
            color3 + "\"? " + equals2);
}

public void getIndexOfString() {
    String str = "The quick brown fox jumps over the lazy dog.";

    int a = str.indexOf("a", 0);
    int b = str.indexOf("b", 0);
    int c = str.indexOf("c", 0);
    int d = str.indexOf("d", 0);
    int e = str.indexOf("e", 0);
    int f = str.indexOf("f", 0);
    int g = str.indexOf("g", 0);
    int h = str.indexOf("h", 0);
    int i = str.indexOf("i", 0);
    int j = str.indexOf("j", 0);
    int k = str.indexOf("k", 0);
    int l = str.indexOf("l", 0);
    int m = str.indexOf("m", 0);
    int n = str.indexOf("n", 0);
    int o = str.indexOf("o", 0);
    int p = str.indexOf("p", 0);
    int q = str.indexOf("q", 0);
    int r = str.indexOf("r", 0);
    int s = str.indexOf("s", 0);
    int t = str.indexOf("t", 0);
    int u = str.indexOf("u", 0);
    int v = str.indexOf("v", 0);
    int w = str.indexOf("w", 0);
    int x = str.indexOf("x", 0);
    int y = str.indexOf("y", 0);
    int z = str.indexOf("z", 0);

    System.out.println(" a  b c  d e  f  g h i  j");
    System.out.println("=========================");
    System.out.println(a + " " + b + " " + c + " " + d + " " +
            e + " " + f + " " + g + " " + h + " " +
            i + " " + j + "\n");

    System.out.println("k  l  m  n  o  p q  r  s  t");
    System.out.println("===========================");
    System.out.println(k + " " + l + " " + m + " " + n + " " +
            o + " " + p + " " + q + " " + r + " " +
            s + " " + t + "\n");

    System.out.println("u  v  w  x  y  z");
    System.out.println("================");
    System.out.println(u + " " + v + " " + w + " " + x + " " +
            y + " " + z);

}

public void replaceSymbols() {
    String str = "The quick brown fox jumps over the lazy dog.";

    String new_str = str.replace('d', 'f');

    System.out.println("Original string: " + str);
    System.out.println("New String: " + new_str);

}

public void getSubString() {
    String str = "The quick brown fox jumps over the lazy dog.";

    String new_str = str.substring(10, 26);

    System.out.println("old = " + str);
    System.out.println("new = " + new_str);
}

public void convertToLowercase() {
    String str = "ThE QuIck BroWn FoX!";

    String lowerStr = str.toLowerCase();

    System.out.println("Original String: " + str);
    System.out.println("String in lowercase: " + lowerStr);
}









}
