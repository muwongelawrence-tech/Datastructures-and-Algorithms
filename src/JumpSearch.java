public class JumpSearch {
    // improvement to the linear search.
    // Time Complexity is O(squaroot(n)).

    public int jumpSearch(int[] array , int target){

        int  blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;


        while( start < array.length &&  array[ next - 1] < target){
            start = next;

            if(start >= array.length)
                break;
            next += blockSize;
            if(next > array.length)
                next = array.length;
        }

        for(int i = start; i < next ; i++)
            if(array[i] == target)
                return i;

        return -1;


    }
}
