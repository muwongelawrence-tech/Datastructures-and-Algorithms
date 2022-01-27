import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
         int[] numbers = { 1,5,8,2,3,8,4,6,7,10,9 };
        Bubble_sort sorter = new Bubble_sort();
        SelectionSort sorter1 = new SelectionSort();
        InsertionSort sorter2 = new InsertionSort();
        MergeSort sorter3 = new MergeSort();
        Quicksort sorter4 = new Quicksort();
        CountingSort sorter5 = new CountingSort();

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





    }
}
