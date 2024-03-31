import java.util.Scanner;
import java.util.Set;

public class alternateCharDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queryCount=sc.nextInt();
        String[] str=new String[queryCount];
        for(int r=0;r<queryCount;r++){
            str[r] = sc.nextLine();
            if (str[r].equals("")) {
                str[r] = sc.nextLine();
            }
        }
       for(int r=0;r<queryCount;r++) {
           char[] cArr = str[r].toCharArray();
           int deletion = 0;
           char temp = cArr[0];
           int index = 0;
           //for(int i=index;i<cArr.length;i++){
           for (int j = index + 1; j < cArr.length; j++) {
               if (temp == cArr[j]) {
                   deletion++;
               } else {
                   //ab int c=j+1;
                   temp = cArr[j];
                   index = j + 1;
               }
               //}

           }
           System.out.println(deletion);
       }
    }
}
