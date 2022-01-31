public class ExponentialSearch {
    //time complexity is O(log n) in worst case senario
    public int exponentialSearch(int[] array , int target){
        int bound = 1;
        while(bound < array.length && array[bound] < target){
            bound *= 2;
        }

        int left = bound / 2;
        int right = Math.min(bound ,array.length - 1);

        return binarySearchRec(array,target ,left ,right);
    }

    private int binarySearchRec(int[] array ,int target , int left , int right ){

        //base condition for the recursion
        if(right < left)
            return -1;

        int middle = (left + right) /2 ;

        if(array[middle] == target)
            return middle;

        if(target < array[middle])
            return binarySearchRec(array , target, left, middle - 1);

        return binarySearchRec(array ,target , middle + 1, right);

    }

}
