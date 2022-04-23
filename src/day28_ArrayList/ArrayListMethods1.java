package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        //add()
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30); //the size of the ArrayList has been increased automatically
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.add(2, 25); //inserting new element, rest of the elements will be shifted
        System.out.println(numbers);

        System.out.println("-------------------------------");

        //size()
        System.out.println(numbers.size());
        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("------------------------");

        //get()
        Integer num = numbers.get(3);
        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("------------------------");
        //set()
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2, "JavaScript"); //replacing, size does not change
        list.set(3, "C++"); //replacing, size does not change
        System.out.println(list);

        System.out.println("---------------------");
        //remove
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        employees.remove(0); //decreases the size of the ArrayList everytime it runs
        System.out.println(employees);
        employees.remove(0);
        System.out.println();
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size() - 1);
        System.out.println(employees);
        boolean r1 = employees.remove("Hulya");
        System.out.println(employees);
        boolean r2 = employees.remove("Neira");
        System.out.println(employees);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }
}
