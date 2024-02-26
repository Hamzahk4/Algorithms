import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //
    public static void printArrListOfInts(ArrayList<Integer> arr){
        for (Integer s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void printArrList(ArrayList<String> arr){
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void print(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Arrays with selection sort:");
        print(Algies.alphaSelection(new String[]{"Zebra", "Alpha"}));
        print(Algies.alphaSelection(new String[]{"Zebra", "Alpha", "Beta", "Woah", "Hi", "Hiiii"}));
        print(Algies.alphaSelection(new String[]{"1", "2","4","6","3","9","2","5","h"}));
        System.out.println();
        System.out.println("ArrayLists with selection:");
        printArrList(Algies.alphaSelection(new ArrayList<>(Arrays.asList("Zebra", "Alpha"))));
        printArrList(Algies.alphaSelection(new ArrayList<>(Arrays.asList("Zebra", "Alpha", "Beta", "Woah", "Hi", "Hiiii"))));
        printArrList(Algies.alphaSelection(new ArrayList<>(Arrays.asList("1", "2","4","6","3","9","2","5","z"))));
        System.out.println("\nArrayLists of integers with selection sort:");
        printArrListOfInts(Algies.alphaSelectionInts(new ArrayList<>(Arrays.asList(1,0,-1))));
        printArrListOfInts(Algies.alphaSelectionInts(new ArrayList<>(Arrays.asList(1,0,-1,3,7,34,-4,-6))));
        printArrListOfInts(Algies.alphaSelectionInts(new ArrayList<>(Arrays.asList(1,0,-1,3,7,34,-4,-6,5,7,2,8,4,-7,-7,-6,-2))));

        Algies a = new Algies();
//      --------------------------------------------------------------------------------
        // List With Insertion Sort
        System.out.println("\nArray with Insertion:");
        String[] str1 = {"z","b","a"}; String[] s1 = a.insertionSort(str1);
        String[] str2 = {"Zebra","alpha"}; String[] s2 = a.insertionSort(str2);
        String[] str3 = {"cat","rat","mat", "jholmer"}; String[] s3 = a.insertionSort(str3);
        print(s1); print(s2); print(s3);
        System.out.println("\nArrayList with Insertion:");
//      // ArrayList with insertion sort
        ArrayList<String> aL1 = new ArrayList<String>(Arrays.asList("Zebra","alpha")); aL1 = a.insertionSortButForAL(aL1);
        ArrayList<String> aL2 = new ArrayList<String>(Arrays.asList("Zebra","alpha","map","jholmer epic")); aL2 = a.insertionSortButForAL(aL2);
        ArrayList<String> aL3 = new ArrayList<String>(Arrays.asList("seeds","capes","urchin?")); aL3 = a.insertionSortButForAL(aL3);
        printArrList(aL1); printArrList(aL2); printArrList(aL3);
        System.out.println("\nArrayList of ints with Insertion:");
        // ArrayList of INTS with insertion sort
        ArrayList<Integer> i1 = new ArrayList<Integer>(Arrays.asList(1,0,-1)); i1 = a.insertionSortButForInts(i1);
        ArrayList<Integer> i2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,9090,-1*4)); i2 = a.insertionSortButForInts(i2);
        ArrayList<Integer> i3 = new ArrayList<Integer>(Arrays.asList(0,45,67,-4,-90)); i3 = a.insertionSortButForInts(i3);
        printArrListOfInts(i1); printArrListOfInts(i2); printArrListOfInts(i3);
//      --------------------------------------------------------------------------------

    }
}
