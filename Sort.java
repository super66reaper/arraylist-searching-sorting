import java.util.*;

public class Sort {
    private static int size;

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        //Correct Order
        // strings.add("apple");
        // strings.add("bear");
        // strings.add("chair");
        // strings.add("darel");
        // strings.add("err");
        // strings.add("fight");
        // strings.add("good");
        // strings.add("hi");
        // strings.add("intel");
        // strings.add("jorge");

        strings.add("intel");
        strings.add("chair");
        strings.add("err");
        strings.add("bear");
        strings.add("jorge");
        strings.add("fight");
        strings.add("good");
        strings.add("apple");
        strings.add("hi");
        strings.add("darel");

        size = 10;

        selectionSort(strings);
        insertionSort(strings);
        bubbleSort(strings);
    }

    private static void selectionSort(ArrayList<String> list) {
        //Temporary string
        String t;

        for(int i = 0; i < size; i++) {
            int min = i;
            
            for(int k = i + 1; k < size; k++) {
                if(list.get(k).compareTo(list.get(min)) < 0) {
                    min = k;
                }
            }
            
            if(min != i) {
                t = list.get(i);
                list.set(i, list.get(min));
                list.set(min, t);
            }
        }

        for(int i = 0; i < size; i++) {
            System.out.println("Selection Sort: " + list.get(i));
        }
    }
    
    private static void insertionSort(ArrayList<String> list) {
        //Temporary string
        String t;
        
        for(int i = 0; i < size; i++) {
            t = list.get(i);
            
            int k = i;
            while(k > 0 && list.get(k - 1).compareTo(t) > 0) {
                list.set(k, list.get(k - 1));
                k--;
            }

            list.set(k, t);
        }

        for(int i = 0; i < size; i++) {
            System.out.println("Insertion Sort: " + list.get(i));
        }
    }

    private static void bubbleSort(ArrayList<String> list) {
        //Temporary string
        String t;

        for(int k = 0; k < size - 1; k++) {
            //Check for needing swapped
            if(list.get(k + 1).compareTo(list.get(k)) < 0) {
                //Swapping
                t = list.get(k);
                list.set(k, list.get(k + 1));
                list.set(k + 1, t);
            }
        }

        for(int i = 0; i < size; i++) {
            System.out.println("Bubble Sort: " + list.get(i));
        }
    } 
}