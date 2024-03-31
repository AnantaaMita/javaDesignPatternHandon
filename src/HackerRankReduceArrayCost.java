import com.sun.source.tree.Tree;

import java.util.*;

public class HackerRankReduceArrayCost {
    public static void main(String[] args) {
        int[] nums = {25, 10, 20,50};
        LinkedList<Integer> li = new LinkedList<>();
        List<Integer> add=new ArrayList<>();
        int a;
        for (int num : nums) {
            li.add(num);
        }
        Collections.sort(li);
        while (li.size()>1) {
            a = li.getFirst() + li.get(1);
            add.add(a);
            li.removeFirst();
            li.removeFirst();
            if (!li.isEmpty()) {
                for (int i = 0; i < li.size(); i++) {
                    if (li.get(i) > a) {
                        li.add(i, a);
                        break;
                    }
                    else if(i+1==li.size()){
                        li.add(a);
                        break;
                    }
                }
            }
        }
    int finalSum=0;
        for (int num : add) {
           finalSum=finalSum+num;
        }
        System.out.println(finalSum);

    }
}
