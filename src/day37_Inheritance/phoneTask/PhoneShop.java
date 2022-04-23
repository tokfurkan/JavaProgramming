package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy s19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12334235);
        iphone.faceTime(23141412);
        iphone.faceTime("cydeo@gmail.com");

        System.out.println("-----------------------");

        samsung.call(911);
        samsung.text(1231123213);
        samsung.freeze();

        System.out.println("--------------------------");

        nokia.call(911);
        nokia.text(81912731);
        nokia.selfDefense();

        System.out.println("---------------------------");
        //you can call static variables by the class name

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);






    }




}
