import java.util.HashSet;
import java.util.Set;

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

    public static String reverseWords(String sentence){
        if(sentence == null)
            return "";

        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length -1; i>=0; i--)
            reversed.append(words[i] + " ");

       return reversed.toString().trim();
    }

    public static boolean areRotations( String str1 , String str2){

        if(str1 == null || str2 == null)
            return false;

        // better implementation.
        return (str1.length() == str2.length() && (str1 + str1).contains(str2));

       // long implementation
        //        if(str1.length() != str2.length())
//            return false;
//
//        if(!(str1 + str2).contains(str2))
//            return false;
//
//        return true;

    }

    public static  String removeDuplicates(String str){

        if(str == null)
            return "";
        
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for(var ch : str.toCharArray()){

            if(!seen.contains(ch)){
              seen.add(ch);
              output.append(ch);
            }

        }

        return output.toString();
    }
}
