public class Quicksort {
     // the time complexity is O(nlogn) in  best case
     // And O(n^2) in the worst case.
     // the space complexity of quick sort is O(logn) in best case and
     // O(n) in the worst case scenario.

     public void sort(int[] array){
           sort(array , 0, array.length-1);
     }

     private void  sort(int[] array , int start ,int end){
          // implementing the base case condition
          //to stop the recursion
          if(start >= end)
               return;

          //partition
          int boundary = partition(array , start , end);
          //sort left partition

          sort(array ,start ,boundary -1);
          //sort right partition
          sort( array , boundary + 1 , end);


     }

     private int partition(int[] array , int start ,int end ){
          // assuming that the pivot is the last element of the array
          int pivot = array[end];
          int boundary = start - 1;

          for(int i = start; i < end ; i++)
               if(array[i] <= pivot)
                    swap( array , i , ++boundary);


          return boundary;
     }

     private void swap(int [] array, int index1 , int index2){
          int temp = array[index1];
          array[index1] = array[index2];
          array[index2] = temp;
     }
}
