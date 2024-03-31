import java.util.Arrays;

public class LeetEDTwoSum {
    public static void main(String [] args) {
        int[] arr = {10, 25, 23, 6,8,8, 78};
        int target = 16;
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<target) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        System.out.println(Arrays.toString(res));
                    } else {
                        continue;
                    }
                }
            }
        }
       // System.out.println(Arrays.toString(res));

    }

}
