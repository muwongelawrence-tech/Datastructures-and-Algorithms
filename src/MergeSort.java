public class MergeSort {
    // Time Complexity is O(nlogn) in both
    // best and worst cases.
    public void ascending (int[] array){
        // stop recursion if the array passed has only one element
        // base case condition to terminate the recursion.
        // but it requires alot of space with a space complexity of O(n)
        if(array.length < 2)
            return;


        //divide the array into half
        int middle = array.length /2;
        int[] left = new int[middle];

        for(int i = 0; i < middle ; i++ )
            left[i] = array[i];

        int[] right = new int[array.length - middle];

        for(int k = middle; k < array.length; k++)
            right[k - middle] = array[k];

        //sorting each half recursively
        ascending(left);
        ascending(right);

        // merge the result of each half to the result
        merge(left , right, array);

    }

    private void merge(int[] left ,int[] right , int[] result){
         int i = 0, j = 0, k = 0;
         // first while loop to iterate over the two halves.
        while(i < left.length && j < right.length){
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        // second while loop to iterate through the remaining elements of any
        // bigger half than the other.

        // copying remaining items in the left partition to the result
        while( i < left.length)
            result[k++] = left[i++];
        // copying remaining items in the right partition to the result
        while( j < right.length)
            result[k++] = right[j++];
    }
}
