import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //use arrays if you know the number of items to store.

         int[] numbers = { 1,5,8,2,3,8,4,6,7,10,9 };
         int[] sorted_numbers = { 1,2,3,4,5,6,7 };

         // Sorting Algorithms
        Bubble_sort sorter = new Bubble_sort();
        SelectionSort sorter1 = new SelectionSort();
        InsertionSort sorter2 = new InsertionSort();
        MergeSort sorter3 = new MergeSort();
        Quicksort sorter4 = new Quicksort();
        CountingSort sorter5 = new CountingSort();

        // Searching Algorithms
        LinearSearch search1 = new LinearSearch();
        BinarySearch search2 = new BinarySearch();
        TernarySearch search3 = new TernarySearch();
        ExponentialSearch search4 = new ExponentialSearch();

        // Data Structures
        //Linked lists
        LinkedList items_2 = new LinkedList();
        items_2.addLast(10);
        items_2.addLast(20);
        items_2.addLast(30);
//        System.out.println(items_2.indexOf(40));
//        items_2.removeFirst();
//        items_2.removeLast();
//        items_2.reverse();
        System.out.println(items_2.getKthFromTheEnd(3));
        var array = items_2.toArray();
        System.out.println(Arrays.toString(array));
//        System.out.println(items_2.contains(30));

        ArraysDemo items = new ArraysDemo(5);
        System.out.println("-------working with arrays----------");
        items.insert(5);
        items.insert(6);
        items.insert(7);
        items.insert(8);
        items.insert(10);
        items.insert(11);
        items.insert(12);
//        items.removeAt(2);
        System.out.println("printing index of passed item");
        System.out.println(items.indexOf(12));
        System.out.println("printing the items in the array.");
        items.print();
        System.out.println("reversing the order of the original array");
        items.reverse();



        System.out.println("-------Testing the searching Algorithms------------");
        int searched_number =  search4.exponentialSearch(sorted_numbers , 7);
        System.out.println("the number was found in index "+ searched_number + " of the array");

        System.out.println("Hello muwonge lawrence, welcome to  datastuctures and algorithms.");
        System.out.println("Today its " + new Date());
        System.out.println("Original array is;");
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----first lets deal with sorting algorithms------");
        System.out.println("1.Bubble sort O(n^2)");
        System.out.println("sorting the array in ascending order using bubble sort;");
        sorter.ascending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("sorting the array in descending order using bubble sort;");
        sorter.descending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(" 2.Selection sort O(n^2) in all best and worst cases.");
        System.out.println("sorting the array in ascending order using Selection sort;");
        sorter1.ascending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("sorting the array in Descending order using Selection sort;");
        sorter1.desccending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("3. Insertion sort O(n^2) in worst case scenario ");
        System.out.println("sorting the array in ascending order using Insertion sort;");
        sorter2.ascending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("4. Merge sort  with O(nlogn) / Divide and conquer algorithm");
        System.out.println("sorting the array in ascending order using Mergesort;");
        sorter3.ascending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("5.-- sorting the array using quick sort Algorithm--");
        sorter4.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("6.** sorting the array using  countingSort  Algorithm **");
        sorter5.sort(numbers , 10);
        System.out.println(Arrays.toString(numbers));

        // String Manipulation implementations
        String reversed = StringManipulation.reverse("MUWONGE");
        System.out.println(reversed);

        // strings are rotations of each other
        boolean x = StringManipulation.areRotations("ABCD","DABC");
        System.out.println(x);

        // removing duplicates from strings
         String removed = StringManipulation.removeDuplicates("Trees are beautiful");
        System.out.println(removed);





    }
}
