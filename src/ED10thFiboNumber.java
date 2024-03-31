import java.util.Arrays;

public class ED10thFiboNumber {
    public static void main(String [] args)
    {
        int current=0;
        int next=1;
        int[] arr = new int[10];
        arr[0]=current;
        arr[1]=next;
        for(int i=2;i<10;i++){
            arr[i]=current+next;
            current=next;
            next=arr[i];
        }
        System.out.println(arr[arr.length-1]);
    }
}

