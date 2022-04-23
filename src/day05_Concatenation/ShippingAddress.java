package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "Furkan";
        String buildingNumber = "33ABC";
        String streetName = "Wall Street";
        String city = "İzmir";
        String state = "Buca";
        String zipCode = "35400Buca";
         */

        String name = "Furkan Tök",
                buildingNumber = "1218B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22340A";

        System.out.println(name + "\n" + buildingNumber + " " +
                streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " +
                streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);




    }

}
