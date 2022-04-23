package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@yahoo.com";

        String output = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println(output);

        System.out.println("---------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 11); // Java is fun
        System.out.println(s1);
        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg, end);
        System.out.println(s2);
        String s3 = str1.substring(str1.lastIndexOf("I"));
        System.out.println(s3);


    }
}
