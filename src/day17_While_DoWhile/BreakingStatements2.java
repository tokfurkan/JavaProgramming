package day16_ForLoopsStringPractice.day17_While_DoWhile;

public class BreakingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C'){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------");

        //print all even numbers 1-10

        for (int i = 1; i <= 10; i++) {

            if (!(i % 2 == 0)){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-------------------------------");
        //print all odd numbers 1-10

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }





    }
}
