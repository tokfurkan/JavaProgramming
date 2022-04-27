package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test 1 started");

        try{
            System.out.println(9 / 0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception was occured");
        }


        System.out.println("Test 1 completed");

        System.out.println("------------------------------");

        System.out.println("test 2 started");

        int [] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");
        }catch (RuntimeException e){
            //System.out.println("catch block");
            //System.out.println("Run Time Exception was occured");
            e.printStackTrace();
        }

        System.out.println("test 2 completed");

        System.out.println("--------------------------------------");

        System.out.println("test 3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("test 3 completed");

        System.out.println("----------------------------------");









    }



}
