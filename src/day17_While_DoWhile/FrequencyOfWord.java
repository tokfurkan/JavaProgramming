package day16_ForLoopsStringPractice.day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJava";
        int frequency = 0;
        //              to make sure it does not exceed the maximum index number of the string
        for (int i = 0; i <= str.length() - 4; i++) { //i: 0,1,2,3,4,5,6,7
            String eachSub = str.substring(i, i+4);

            if (eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);;





    }
}
