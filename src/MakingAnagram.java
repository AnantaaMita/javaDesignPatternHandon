import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if (str1.equals("")) {
            str1 = sc.nextLine();
        }
        String str2 = sc.nextLine();
        if (str2.equals("")) {
            str2 = sc.nextLine();
        }

        char[] tchars2 = str2.toCharArray();

        char[] tchars1 = str1.toCharArray();
        char[] chars1 = new char[tchars1.length], chars2 = new char[tchars2.length];
        String temp1 = null;
        int flag;
        if (tchars1.length <= tchars2.length) {
            chars1 = tchars1;
            chars2 = tchars2;
            flag = 0;
        } else {
            chars1 = tchars2;
            chars2 = tchars1;
            flag = 1;
        }
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i] == chars2[j]) {

                    if (flag == 0) {
                        str1 = str1.replaceFirst(String.valueOf(chars1[i]), "#");
                        str2 = str2.replaceFirst(String.valueOf(chars1[i]), "*");
                        chars2 = str2.toCharArray();
                    } else {
                        str2 = str2.replaceFirst(String.valueOf(chars1[i]), "*");
                        str1 = str1.replaceFirst(String.valueOf(chars1[i]), "#");
                        chars2 = str1.toCharArray();
                    }
                    break;
                }
            }
        }

        int tot = str1.replace("#", "").length() + str2.replace("*", "").length();
        System.out.println(tot);

    }

}
