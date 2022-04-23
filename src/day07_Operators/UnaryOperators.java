package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("-------------------------------");

        int a = 5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a); //6

        --a; //pre decrement: decreases the value by 1 right away

        System.out.println(a); //5

        System.out.println("-------------------------------");

        int b = 100;

        System.out.println(++b); //pre increment: increases the value by 1 right away

        int c = 100;

        System.out.println(c++); // post increment: first it passes the correct value then increases the value by 1
        System.out.println(c); //101

        System.out.println("-------------------------------");

        int x = 200;

        System.out.println(--x); //pre decrement: it decreases the value by 1 right away
        //199

        int y = 200;
        System.out.println(y--); //post decrement: first passes the correct value then decreases the value by 1
        System.out.println(y); //199

        System.out.println("-------------------------------");

        int z = 45;

        System.out.println(++z); //46, z = 46
        System.out.println(z++); //46, z = 47 (final value)
        System.out.println(z); //47

        int q = 30;

        System.out.println(--q); //29
        System.out.println(q--); //29 final value: 28
        System.out.println(q); //28










    }

}
