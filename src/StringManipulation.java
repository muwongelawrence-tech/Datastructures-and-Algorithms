public class StringManipulation {
    public static int countVowels(String str){

        if(str == null)
            return 0;

        int count = 0;
         String vowels = "aeiou";
         for(var ch : str.toLowerCase().toCharArray())
             if(vowels.indexOf(ch) != -1)
                 count++;

         return count;
    }

    public static String reverse(String str){

        if(str == null)
            return "";

        // implementation of O(n^2)
       //  String reversed = "";
      //  for(int i = str.length(); i >= 0; i--) O(n)
      //        reversed += str.charAt(i); O(n)

        // better way is to implement using the StringBuilder class.
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)  //O(n)
            reversed.append(str.charAt(i));  //O(1)



        return reversed.toString();
    }
}
