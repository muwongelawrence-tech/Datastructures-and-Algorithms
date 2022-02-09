import java.util.*;

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

    public static char  getMaxOccuringChar(String str){
//        Map<Character , Integer> frequencies = new HashMap<>();
//        for(var ch : str.toCharArray()){
//            if(frequencies.containsKey(ch))
//                frequencies.replace(ch , frequencies.get(ch))
//            else
//                frequencies.put(ch, 1);
//        }

        if(str == null || str.isEmpty())
            throw new IllegalArgumentException();

        final int ASCII_SIZE =256;
        int[] frequencies = new int[ASCII_SIZE];
        for(var ch: str.toCharArray())
            frequencies[ch]++;

        int max = 0;
        char result = ' ';

        for(int i = 0; i < frequencies.length; i++)
            if(frequencies[i] > max){
                max = frequencies[i];
                result = (char) i;
            }


    return result;

    }

    public static String capitalize(String sentence){
        if(sentence == null || sentence.trim().isEmpty())
            return "";

        String[] words = sentence.trim().replaceAll(" +"," ").split(" ");
        for(int i = 0; i < words.length; i++){
          words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

       return  String.join(" ", words);
    }

    // Strings that are Angrams of each other.
    public static boolean areAnagrams(String first , String second){
        //optimizing for the larger input.
        if(first == null || second == null || first.length() != second.length())
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);

    }

    public static boolean areAnagram2(String first , String second){
        if(first == null || second == null)
            return false;

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();

        for(int i = 0; i < first.length(); i++){
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();

        for(int i = 0; i < second.length(); i++){
            int index = second.charAt(i) - 'a';
            if(frequencies[index] == 0)
                return false;

            frequencies[index]--;
        }

        return true;
    }

}
