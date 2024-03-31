import java.util.Scanner;

public class StringCamelCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.equals(" ")){
            str=sc.nextLine();
        }
        sc.close();
        char[] c=str.toCharArray();
        int flag;
        if(str.trim().length()>0) {
             flag = 1;
        }
        else{
            flag=0;
        }
        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                flag++;
            }
        }
        System.out.println(flag);
    }
}
