public class ArraysDemo {
    //Array data is the simplest datastructure
    // Dynamic arrays are implemented in java using the ArrayList class
    // which grows by 50% of its original size.
    //And the vector class which grows by 100% of its original size
    //Note that vector class supports single threaded applications(synchronized)
    // Arrays are great when you know how many items you have to insert in them.
    //lookup by index O(1)
    //lookup by value O(n)
    //insert O(n)
    // delete O(n)

    private int[] items;
    private int count;

    // constructor
   public  ArraysDemo(int length){
        items = new int[length];

   }

 // printing items inserted in the array using variable count.
   public void print(){
       for(int i = 0; i < count; i++)
           System.out.println(items[i]);
   }

   // inserting new items in the array
   public void insert(int item){
//        if  the array is full, resize it
       if(items.length == count){
           // create a new array (twice the size)
           int[] newItems = new int[count * 2];
           // copy all the existing items
           for(int i = 0; i < count ; i++)
               newItems[i] = items[i];

           // Set items  to this new array
           items = newItems;
       }

//        Add item at the end of the array
         items[count++] = item;


   }

   public void removeAt(int index){
       //validate index
       if(index < 0 || index >= count)
            throw new IllegalArgumentException();

       //shift the items to the left to fill the hole
       for(int i = index; i < count; i++)
           items[i] = items[i + 1];

       // decrement count by one to reduce the size of the array.
       count--;
   }

   public int indexOf(int item){
       for(int i = 0 ; i < count; i++)
           if(items[i] == item)
               return i;

       return -1;
   }

   // reversing the order of items in the array
   public void reverse(){
       for(int i = count-1 ; i >= 0; i--)
           System.out.println(items[i]);

   }












//   Big-O notation Analysis
    // O(n) operations
     public void log(int [] numbers ,String [] names){
         for(int i = 0; i<= numbers.length; i++){
             System.out.println(numbers[i]);
         }

         for(String name : names){
             System.out.println(name);
         }
     }

    // O(n^2) operations
    public void log1(int [] numbers){
        for(int first : numbers)
            for(int second : numbers)
                System.out.println(first + " ," + second);
     }

    // O(n^3) operations
    public void log2(int [] numbers){
        for(int first : numbers)
            for(int second : numbers)
                for(int third : numbers)
                    System.out.println(first + " ," + second + " ," + third);
    }

}







