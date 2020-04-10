import java.util.*; 

public class Search {

    private static int size = 0;

    public static void main(String[] args) {
        ArrayList<String> hayStack = new ArrayList<String>();

        hayStack.add("apple");
        hayStack.add("bear");
        hayStack.add("chair");
        hayStack.add("darel");
        hayStack.add("err");
        hayStack.add("fight");
        hayStack.add("good");
        hayStack.add("hi");
        hayStack.add("intel");
        hayStack.add("jorge");

        size = 10;

        System.out.println(search(hayStack, "intel"));
        System.out.println(binarySearch(hayStack, "intel"));
    }

    private static int search(ArrayList<String> haystack, String needle) {
        int t = 0;
        int index = -1;

        for(int i = 0; i < size; i++) {
            t = i + 1;
            if(haystack.get(i).equals(needle)) {
                index = i;
            }
        }

        System.out.println("Binary Search Ran " + t + " Times");
        return index;
    }

    private static int binarySearch(ArrayList<String> haystack, String needle) {
        int start = 0;
        int last = size - 1;
        int mid = 0;

        int t = 0;

        while(start <= last) {
            t++;
            mid = (start + last) / 2;
            if(haystack.get(mid).equals(needle)) {
                System.out.println("Binary Search Ran " + t + " Times");
                return mid;
            }else if(haystack.get(mid).compareTo(needle) < 0) {
                start = mid + 1;
            }else {
                last = mid - 1;
            }
        }

        System.out.println("Binary Search Ran " + t + " Times");
        return -1;
    }
}