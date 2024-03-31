import java.util.Arrays;

public class ED0atEnd {
    public static void main(String [] args) {
     int[] a={1,2,0,3,0,7,0,9};
int j=0;
     for(int i=0;i<a.length;i++){
         if(a[i]!=0){
             a[j]=a[i];
             j++;
         }
     }
     for(int i=a.length-1;i>a.length-j+1;i--)
     {
         a[i]=0;
     }
   System.out.println(Arrays.toString(a));
    }
}
