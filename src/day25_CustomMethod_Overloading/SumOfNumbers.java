package day23_CustomMethods_Void.day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        sumOfTwoNumbers(100, 200);
        System.out.println("--------------------------");
        sumOfThreeNumbers(100, 200, 300);
        System.out.println("---------------------------");
        sumOfFourNumbers(10, 20, 30, 40);



    }

    //methods:
    //create a method that can find sum of two numbers
    public static int sumOfTwoNumbers(int a, int b){
        int result = 0;
        result = a + b;
        System.out.println("Sum of the numbers: " + (a + b));
        return result;
    }
    //create a method that can find the sum of three numbers
    public static int sumOfThreeNumbers(int a, int b, int c){
        int result = 0;
        result = a + b + c;
        System.out.println("Sum of three numbers: " + result);
        return result;
    }
    //create a method tha can find the sum of four numbers
    public static int sumOfFourNumbers(int a, int b, int c, int d){
        int result = 0;
        result = a + b + c + d;
        System.out.println("Sum of four numbers: " + result);
        return result;
    }

}
