package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("------------------------------");
        helloCydeo5Times();
        System.out.println("-------------------------------");
        evenNumbers();
    }

    //create a function that can print hello world 5 times
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }
    //create a function that can print hello cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }
    //create a function that can print all the even numbers between 1 to 10
    public static void evenNumbers(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0){
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }




}
