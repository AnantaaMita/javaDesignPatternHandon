import java.util.Arrays;

public class MinSubstitutions {

    public static int minSubstitutions(String word) {
        int count = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
                word=word.substring(0,i)+"*"+word.substring(i+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"add", "boook", "break"};
        int[] results = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            results[i] = minSubstitutions(words[i]);
        }

        System.out.println("Minimum substitutions for each word:");
        String s="[";
        String s1="]";
        String  s2="";
        for (int result : results) {
            s2= Arrays.toString(results);

        }
        System.out.print(s2.replace(" ",""));
    }
}
