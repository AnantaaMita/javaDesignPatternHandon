import java.util.Arrays;

public class EDArrayOdd {
    public static void main(String [] args)
    {
        int[] arr={1,3,5,7};
        EDArrayOdd ed=new EDArrayOdd();
        System.out.println(ed.checkOdd(arr));
        arr=ed.sortArray(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(ed.sortArray(arr)));
    }
    public boolean checkOdd(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                flag=false;
                 break;
            }
        }
        return flag;
    }
    public int findLargeNum(int[] arr){
        int max=arr[0];
        return max;
    }
    public int[] sortArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            int max;
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   max=arr[i];
                   arr[i]=arr[j];
                   arr[j]=max;
               }
            }
        }
        return arr;
    }


}
