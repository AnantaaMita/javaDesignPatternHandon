import java.util.*;

public class HackerrankStringFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals(" ")) {
            str = sc.nextLine();
        }

        String fingWord = "hackerrank";
        char[] chars = fingWord.toCharArray();
        Map<Character, Integer> fwMap = new HashMap<>();
        for (char c : chars) {
            if (fwMap.containsKey(c)) {
                fwMap.put(c, fwMap.get(c) + 1);
            } else {
                fwMap.put(c, 1);
            }
        }


        char[] charsWord = str.toCharArray();
        Map<Character, Integer> wMap = new HashMap<>();

   /* List<char[]> asList = Arrays.asList(chars);
    List<Character> listC = new ArrayList<Character>();*/
        for (char c : chars) {
            if (wMap.containsKey(c)) {
                wMap.put(c, wMap.get(c) + 1);
            } else {
                wMap.put(c, 1);
            }
        }
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (fwMap.get(chars[i]) > wMap.get(chars[i])) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

}
