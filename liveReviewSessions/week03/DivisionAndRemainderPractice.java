package week03;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        //input is some amount of seconds (45000)
        // hours : minutes : seconds

        int inputSeconds = 45000;
        int hours, minutes, seconds;

        seconds = inputSeconds % 60; //calculate remaining seconds
        minutes = (inputSeconds / 60) % 60; //remaining minutes
        hours = inputSeconds / 3600; // how many hours we have

        String clock = "Hours : " + hours + " Minutes : " + minutes + " Seconds : " + seconds;
        System.out.println("clock = " + clock);


    }
}
