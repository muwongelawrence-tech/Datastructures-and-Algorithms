import java.util.Arrays;

public class CountingSort {
    // Time complexity of counting sort is O(n^2)
    // the space complexity is O(n)
    //values are positive integers
    // suitable when most of the values in the range are present.

    public void sort(int[] array ,int max){
        int[] counts = new int[max + 1];
//        System.out.println(Arrays.toString(counts));
        for(int item : array)
            counts[item]++;
//        System.out.println(Arrays.toString(counts));
         int k = 0;
        for(int i = 0 ; i < counts.length; i++)
            for(int j = 0 ; j < counts[i]; j++)
                array[k++] = i;


    }

}
