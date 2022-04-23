package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b = (short)a;

        int c = b;
        //int c = (int)b;

        long d = c;
        //long d = (long)c

        float e = d;
        double f = e;

        System.out.println("-------------------------------");

        int x = 55;
        // short y = x; compiler error
        short y = (short)x; //explicit casting which we need to do manually every single time!

        System.out.println(x + " " + y);


        long j = 1_000_000;
        short k = (short)j;

        System.out.println(j + ":" + k);
        //bu print fonksiyonunun sonucunda short primitive type 1.000.000 değerini kapsayamadığı için başka sonuç verecek.

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n; //int primitive type integer lar için tasarlandığı için print edildiğinde matematikteki gibi
                        // 11 e yuvarlamak yerine double sayısının integer kısmını print eder. (10)
        System.out.println(n + " : " + s);

        System.out.println("------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);






    }



}
