package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {
        // trim() White Spaces
        String str1 = "        batch 25         ";
        str1 = str1.trim(); // "batch 25"

        System.out.println(str1);

        // IndexOf()

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println(n1);

        int n2 = str2.indexOf("ool");
        System.out.println(n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("an");
        System.out.println(n3);
        int n4 = str3.indexOf("g ");
        System.out.println(n4);

        //lastIndexOf()

        int n5 = str3.lastIndexOf("g");
        System.out.println(n5);

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int secondA = s.indexOf("a ");
        System.out.println(firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println(lastA);
        System.out.println(secondA);
        int thirdA = s.indexOf("a C");
        System.out.println(thirdA);
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        System.out.println(fourthA);
        //int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W");
        System.out.println(fifthA);
        int sixthA = s.lastIndexOf("aw");
        System.out.println(sixthA);
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");
        System.out.println(seventhA);


    }
}
