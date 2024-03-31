import java.util.List;
import java.util.Scanner;

public class StringAdjasentCharRemove {
    public static String finalStr="";

    public String remove(String finalStr){
        char[] c=finalStr.toCharArray();

        for(int i=0;i<c.length-1;i++) {
            for (int j = i; j < c.length - 1; j++) {
                Boolean flag = false;
                if (c[j] == c[j + 1]) {
                    String sub1 = finalStr.substring(0, j);
                    String sub2 = finalStr.substring(j + 2, finalStr.length());
                    finalStr = sub1 + sub2;
                    c = finalStr.toCharArray();
                    flag = true;
                }
                while (c.length > j & flag & j==0) {
                    if (c[j] == c[j + 1]) {
                        String sub1 = finalStr.substring(0, j);
                        String sub2 = finalStr.substring(j + 2, finalStr.length());
                        finalStr = sub1 + sub2;
                        c = finalStr.toCharArray();
                    } else{
                        break;
                    }
                    if (c.length < j) {
                        break;
                    }
                }
            }
        }
        return finalStr;
    }

    public static void main(String[] args){
        StringAdjasentCharRemove sa=new StringAdjasentCharRemove();
        Scanner sc=new Scanner(System.in);
        finalStr=sc.nextLine();
        if(finalStr.equals(" ")){
            finalStr=sc.nextLine();
        }

            int bRemove=finalStr.length();
            finalStr= sa.remove(finalStr);
            while (bRemove!=finalStr.length()){
                bRemove=finalStr.length();
                finalStr= sa.remove(finalStr);

            }
        System.out.println(finalStr);
        }
}



