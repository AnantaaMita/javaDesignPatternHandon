import java.util.*;

public class LeetLongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("")) {
            str = sc.nextLine();
        }
        if (str.length() > 0) {
            char[] tchars = str.toCharArray();
            int count = 0;
            //String str1[] = new String[str.length()];
            TreeSet<Integer> tree = new TreeSet<>();
            List<Character> li = new ArrayList<>();
            int len = 0;
            for (char c : tchars) {
                len++;

                if (!li.contains(c)) {
                    li.add(c);
                } else {
                    tree.add(li.size());
                    if (li.contains(c)) {
                        li.subList(0, li.indexOf(c) + 1).clear();
                        li.add(c);
                    }
                    else {
                        li.clear();
                        li.add(c);
                    }
                }
                if (len == tchars.length) {;
                    tree.add(li.size());
                }

            }
            li.clear();

            for (int i = tchars.length - 1; i >= 0; i--) {

                if (!li.contains(tchars[i])) {
                    li.add(tchars[i]);
                } else {
                    tree.add(li.size());
                    if (li.contains(tchars[i])) {
                            li.subList(0, li.indexOf(tchars[i]) + 1).clear();
                            li.add(tchars[i]);
                        }
                      else {
                        li.clear();
                        li.add(tchars[i]);
                    }
                }
                if (i == 0) {
                    // str1[count] = li.toString();
                    tree.add(li.size());
                }
            }
            System.out.println(tree.last());
        } else {
            System.out.println("0");
        }
    }
}
