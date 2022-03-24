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

        //Queues and Circular Queues and Priority Queues

        ArrayQueue queue = new ArrayQueue(5);
        ArrayCircularQueue Cqueue = new ArrayCircularQueue(6);

        PriorityQueue pqueue = new PriorityQueue();

        //Stacks

        StackArray stack = new StackArray(5);

        //Graphs

        var graph = new Graph();



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

        // most reapeted character in the string
        var most_repeated = StringManipulation.getMaxOccuringChar("Trees are beautiful");
        System.out.println(most_repeated);

        //Sentence Capitalization(capitalize every first letter of a sentence.
        String capitalized = StringManipulation.capitalize("today is a great day");
        System.out.println(capitalized);

        //checking whether a string is a palindrome
        var result = StringManipulation.isPalindrome2("ABBA");
        System.out.println(result);

        //working with queues
        System.out.println("-----------Queues------------");
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        //        queue.dequeue();
        //        queue.dequeue();
        //        queue.enqueue(10);
        //        System.out.println(queue.size());
        System.out.println(queue.toString());
        queue.reverse();

        //working with  circular queues
        System.out.println("-----------Circular Queues------------");
        Cqueue.enqueue(3);
        Cqueue.enqueue(8);
        Cqueue.enqueue(9);
        Cqueue.enqueue(10);
        Cqueue.enqueue(11);
        Cqueue.enqueue(12);
        Cqueue.dequeue();
        Cqueue.dequeue();
        Cqueue.enqueue(13);
        Cqueue.enqueue(14);
        System.out.println(Cqueue.size());
        System.out.println(Cqueue.toString());

        //working with  stacks
        System.out.println("-----------Stacks------------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(6);
        stack.push(14);
        stack.push(20);
        stack.push(25);
//        stack.pop();
        stack.pop();
        stack.peek();
        System.out.println(" There are " + stack.size() + " elements in the stack");
        stack.show();
        System.out.println("----Reversed Stack--------");
        stack.reverse();

        //working with  priority Queue
        System.out.println("-----------Priority Queue------------");
        System.out.println(" it arranges objects in order of their priority. ");
        pqueue.add(5);
        pqueue.add(3);
        pqueue.add(6);
        pqueue.add(1);
        pqueue.add(4);
        System.out.println(pqueue);

        // working with Graphs
        System.out.println("-----------Graph Data structure ------------");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.removeEdge("A","C");
        graph.traverseDepthFirst("C");
//        graph.print();
        var list = graph.topologicalSort();
        System.out.println(list);








    }
}
