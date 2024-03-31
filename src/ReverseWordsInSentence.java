public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String inputSentence = "I like Java";
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + reversedSentence);
    }

    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        String str="" ;
        String str2="" ;
        String reverseWord="";
        //StringBuilder reversedSentence = new StringBuilder();


        for (int i = words.length - 1; i >= 0; i--) {
            //reversedSentence.append(words[i]).append(" ");
            str=str+words[i]+" ";
            String currWord=words[i];
            char[] c=currWord.toCharArray();
            for(int j=c.length-1;j>=0;j--){
                reverseWord= reverseWord+c[j];
            }
            str2=str2+reverseWord+" ";
            reverseWord="";

        }
        System.out.println("Output1: " + str2);
        return str.trim();
    }
}
