import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals(" ")) {
            str = sc.nextLine();
        }
        str=str.toLowerCase().replace(" ","");
        Set<Character> s=new HashSet<Character>();
        char[] cArr=str.toCharArray();

        for(int i=0;i<cArr.length;i++) {
            s.add(cArr[i]);
        }
        if(s.size()==26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
