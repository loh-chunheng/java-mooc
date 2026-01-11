import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        System.out.println("");
        
        String[] strings = {"Apple", "Durian", "Banana", "Strawberries", "Blueberries"};
        System.out.println(Arrays.toString(strings));
        Main.sort(strings);
        System.out.println(Arrays.toString(strings));
        
        System.out.println("");
        
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(3);
        integers.add(7);
        integers.add(1);
        System.out.println(integers);
        Main.sortIntegers(integers);
        System.out.println(integers);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("zebra");
        list.add("elephant");
        System.out.println(list);
        Main.sortStrings(list);
        System.out.println(list);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
