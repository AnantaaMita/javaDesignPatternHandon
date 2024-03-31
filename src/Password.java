import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queryCount=sc.nextInt();

        char cArr[] = new char[queryCount];
        for(int i=0;i<queryCount;i++){
            cArr[i] =sc.next().charAt(i);

        }

       /* String str = sc.nextLine();
        if (str.equals("")) {
            str = sc.nextLine();
        }*/
        sc.close();
        int upper=0,lower=0,digit=0,spcl=0,password=0;
        String regexStr="$&+-@#^*()%!";
        //char[] cArr = str.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if(Character.isUpperCase(cArr[i])){
                upper++;
                password++;
            } 
            else if (Character.isLowerCase(cArr[i])) {
                lower++;
                password++;
            }
            else if (Character.isDigit(cArr[i])) {
                digit++;
                password++;
            } else if (regexStr.contains(Character.toString(cArr[i]))) {
                spcl++;
                password++;
            }

        }
        int required = 0;
        int remLen = 6;
        if(password<6) {

            remLen = remLen-password;
        }
        else {
            if(digit<1){
                required++;
            }
            if(spcl<1){
                required++;
            } if (lower<1) {
                required++;
            }
            if (upper<1) {
                required++;
            }
            remLen=required;

        }

        /*if(password>6) {
            remLen=password - required;
        }
        else if(password==6) {
            remLen=required;
        }*/
       System.out.println(remLen);
    }
}
