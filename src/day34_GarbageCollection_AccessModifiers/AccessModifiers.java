package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defautlData = 200; //accessm modifier : default
    private static int privateData = 300;


        public static void method1(){

            System.out.println("Public");

        }

        static void method2(){
            System.out.println("Default");

    }

    private static void method3(){
        System.out.println("Private");
    }


}

