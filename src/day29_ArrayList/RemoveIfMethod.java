package day29_ArrayList;

import utilities.StringUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        //remove() methodunu loop içinde kullanamıyoruz çünkü loop her execute olduğunda index numaraları değişiyor ve
        //loop bize istediğimiz sonucu vermiyor.
        //collection is dynamic sized, this is why when we remove something the index numbers of the elements keep changing

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);
        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                list.remove(i);
            }
        }
         */
        list.removeIf(p -> p < 5); //this expression (Lambda) interally uses iterable which allows us remove the elements during the iteration
        // -> arrow token: reserved for every lambda expression by Java
        System.out.println(list);

        System.out.println("----------------------------------------");
        //remove even numbers
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(p -> p % 2 == 0);
        System.out.println(list2);

        System.out.println("----------------------------------------");
        //remove strings start with letter "j"
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("-------------------------------------");
        //palindrome strings
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));
        names.removeIf(p -> StringUtility.isPalindrome(p));
        System.out.println(names);




    }

}
