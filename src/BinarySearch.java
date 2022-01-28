public class BinarySearch {
    //time complexity is O(log n)
    //space complexity is O(logn)

// Recursive implementation of binary search
    public int binarySearchRec(int[] array , int target ){
    return binarySearchRec( array , target , 0, array.length-1);
}

    private int binarySearchRec(int[] array ,int target , int left , int right ){

        //base condition for the recursion
        if(right < left)
            return -1;

        int middle = (left + right) /2 ;

        if(array[middle] == target)
            return middle;

        if(target < array[middle])
            binarySearchRec(array , target, left, middle - 1);

        return binarySearchRec(array ,target , middle + 1, right);

    }


}
