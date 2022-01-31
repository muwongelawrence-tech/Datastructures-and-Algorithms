public class TernarySearch {
    // Time complexity is O(log 3n)
    // binary search is faster than ternary search

    public int ternarySearchRec(int[] array, int target){
        return ternarySearchRec(array ,target ,0,array.length - 1);
    }

    private int ternarySearchRec(int[] array ,int target , int left , int right){

        if(left > right)
            return -1;

        int partitionSize = (right - left) /3;
        int mid1 = left  + partitionSize;
        int mid2 = right - partitionSize;

        if(array[mid1] == target)
            return mid1;
        if(array[mid2] == target)
            return mid2;

        if(target < array[mid1])
            return ternarySearchRec(array, target, left, mid1 -1);
        if(target > array[mid2])
            return ternarySearchRec(array ,target , mid2 + 1 , right );
        return ternarySearchRec(array , target ,mid1 + 1 , mid2 - 1);

    }
}
