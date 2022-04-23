package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        //isEmpty()

        String str = ""; //length = 0
        boolean r = str.isEmpty();
        System.out.println(r);

        //isBlank()

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2 = "Cydeo        ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        //equalsIgnoreCase: it compares two string without case sensitivity

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //contains

        String sentence =  "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java"); //how to ignore case sensitivity
        boolean r3 = sentence.contains("java") || sentence.contains("JAVA");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("----------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false
        System.out.println(input1.contains("Java")); //false
        System.out.println(input1.toLowerCase().contains("java")); //true
        System.out.println(input1.toUpperCase().contains("JAVA")); //true

        //startsWith()

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().contains("wooden"); // in order to ignore the case sensitivity
        // we first create lower case or upper case version of string
        // then compare it with upper/lower case

        System.out.println(x);
        System.out.println(y);








    }
}
