public class SelectionSort {
    // implementing Selection sort Algorithm.
    // it's time complexity is O(n^2) in both worst and best cases.
    public void ascending (int[] array){
        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array , minIndex , i);
        }
    }

    public void desccending (int[] array){
        for(int k = 0; k < array.length; k++){
            int maxIndex = k;
            for(int j = k; j < array.length; j++){
                if(array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(array ,maxIndex, k);
        }
    }

    private void swap(int [] array, int index1 , int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
