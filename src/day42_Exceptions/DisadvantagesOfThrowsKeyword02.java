package day42_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword02 {

    public static void method(){
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException {

        new FileInputStream("");

    }

    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method3() throws FileNotFoundException, InterruptedException{
        method2();
        Thread.sleep(1000);
    }

    public static void method4() throws Exception{
        method3();
    }



}
