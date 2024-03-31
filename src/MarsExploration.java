import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if (str1.equals("")) {
            str1 = sc.nextLine();
        }
        sc.close();
        str1=str1.toUpperCase();
        String subStr="";
        int count=0;

        for(int i=0;i<str1.length();i=i+3){
            subStr=str1.substring(i,(i+3));
            if(subStr.toCharArray()[0]!='S'){
                count++;
            }
            if(subStr.toCharArray()[1]!='O'){
                count++;
            }
            if(subStr.toCharArray()[2]!='S'){
                count++;
            }
        }


        System.out.println(count);
        }
}

