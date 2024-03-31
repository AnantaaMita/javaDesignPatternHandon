import java.util.ArrayList;
import java.util.List;

public class LeetStackRemoveAllAdjasentDuplicateFromString {
    public static void main(String[] args) {
        String expr = "aa";
        System.out.println(removeAdjasentDuplicate(expr));
    }
    static String removeAdjasentDuplicate(String s) {
        String result = "";
        List<Character> li=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(li.isEmpty()){
                li.add(c);
            }
            else if(li.get(li.size()-1)==c){
                li.remove(li.size()-1);
            }
            else{
                li.add(c);
            }
            }
        if(!li.isEmpty())
        result=li.toString()
                .substring(1, 3 * li.size() - 1)
                .replaceAll(", ", "");

        return result;
    }
}
