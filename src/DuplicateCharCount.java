import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharCount {
    public static void main(String[] args) {
        String fingWord = "hackerrank";
        char[] chars = fingWord.toCharArray();
        Map<Character, Integer> fwMap = new HashMap<Character, Integer>();
        for (char c : chars) {
            if (fwMap.containsKey(c)) {
                fwMap.put(c, fwMap.get(c) + 1);
            } else {
                fwMap.put(c, 1);
            }
        }

        Scanner sc = new Scanner(System.in);
        int query=sc.nextInt();
        String[] str = new String[query];
        for (int i = 0; i < str.length; i++) {
             str[i] = sc.nextLine();
            if (str[i].equals("")) {
                str[i] = sc.nextLine();
            }
        }
        sc.close();
        for(int j=0;j< str.length;j++) {
            char[] charsWord = str[j].toCharArray();


           /* Map<Character, Integer> wMap = new HashMap<>();
            for (char c : charsWord) {
                if (wMap.containsKey(c)) {
                    wMap.put(c, wMap.get(c) + 1);
                } else {
                    wMap.put(c, 1);
                }
            }

            boolean flag = true;
            for (int i = 0; i < chars.length; i++) {

                if (!wMap.containsKey(chars[i])) {
                    flag = false;
                    break;
                } else {
                    if (fwMap.get(chars[i]) > wMap.get(chars[i])) {
                        flag = false;
                        break;
                    }
                }
            }*/
int count=0;
int k;
int temp=0;
           for(int i=0;i<chars.length;i++){
               for( k=temp;k<charsWord.length;k++){
                if(chars[i]==charsWord[k]){
                    count++;
                    temp=k+1;
                    break;
                   }

               }
           }
if(count==chars.length){
    System.out.println("yes");
}
else {
    System.out.println("no");
}





           /* if (!flag) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }*/
        }
    }
}
