public class InsertionSort {
    //Best case  O(1).
    // worst case O(n^2).
    // here we shift instead of swapping.
    public void ascending(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > current){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }
    }

}
