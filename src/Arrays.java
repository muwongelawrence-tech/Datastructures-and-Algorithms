public class Arrays {
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
