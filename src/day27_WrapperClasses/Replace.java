package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        array = replace(array, 2, 30);
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------");

        String[] array2 = {"Java", "Python", "C++", "Ruby"};
        array2 = replace(array2, 2, "C#");
        System.out.println(Arrays.toString(array2));


    } //methods
    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if (index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if (index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if (index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if (index < 0 || index > array.length - 1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


}
