package day40_FinalKeyword;

public class FinalVariable {

    //instance variable
    final String birthday;
    final static String name;

    static {
        name = "EU-8";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        //local variable
        final double pi = 3.14;

        //pi = 4.14; (compile error) final variables cannot be reassigned
        //pi = 5.4; (compile error) final variables cannot be reassigned

        final String name;
        name = "Java";
        //name = "Wooden Spoon"; compile error
        System.out.println(name);

        FinalVariable obj = new FinalVariable("May/01");
        System.out.println(obj.birthday);




    }
}
