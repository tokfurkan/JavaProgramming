package week03;

public class UnaryReview {

    public static void main(String[] args) {

        int a = 20;

        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        int b = 20;
        System.out.println("++b = " + ++b); //21 increase by 1 then use the variable

        int c = 20;
        System.out.println("++c = " + 1); //22

        boolean isMarried = true;

        System.out.println("isMarried = " + !isMarried); //not operator

        int x = 12;

        if (++x > 12){
            System.out.println("x in the IF statement part : "+ x);
        } else {
            System.out.println("x value in the ELSE statement :" + x);
        }




    }
}
