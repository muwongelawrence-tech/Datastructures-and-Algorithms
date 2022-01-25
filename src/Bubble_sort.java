public class Bubble_sort {
    //implementing the bubble sort algorithm
    // Best case O(n).
    // worst case O(n^2).
  public void ascending( int [] array ){
      boolean  isSorted;
      for(int i = 0 ; i< array.length; i++){
          isSorted = true;
          for(int j = 1 ; j < array.length-i ; j++){
               if(array[j] < array [j - 1]){
                   swap(array , j , j-1);
                   isSorted = false;
               }
          }

          if(isSorted)
              return;
      }
  }
    public void descending( int [] array ){
        boolean isSorted;
        for(int i = 0 ; i< array.length; i++){
            isSorted = true;
            for(int j = 1 ; j < array.length-i ; j++){
                if(array[j] > array [j - 1]){
                    swap(array , j , j-1);
                    isSorted = false;
                }
            }

            if(isSorted)
                return;
        }
    }
  private void swap(int [] array, int index1 , int index2){
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
  }

}
