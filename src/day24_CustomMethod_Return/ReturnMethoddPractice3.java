package day24_CustomMethod_Return;

public class ReturnMethoddPractice3 {

    public static void main(String[] args) {

        String str = "aabbccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));

            if (frequency == 1){
                System.out.println(str.charAt(i));
            }
        }



    }
    //methods
    public static int frequency(String str, char ch){
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch){
                count++;
            }
        }
        return count;
    }
}
