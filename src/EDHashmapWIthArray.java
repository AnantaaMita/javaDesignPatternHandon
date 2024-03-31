import java.util.HashMap;
import java.util.Map;

public class EDHashmapWIthArray {
    //static Map<String, Integer[]> prices = new HashMap<String, Integer[]>();

    public static void main(String [] args)
        {
            Map<String, Integer[]> prices = new HashMap<String, Integer[]>();
            prices.put("Saly", new Integer[] {90, 84, 92, 88, 96});
            prices.put("Bob", new Integer[] {72, 84, 92, 66, 80});
            prices.put("Abby", new Integer[] {90, 82, 84, 70, 86});
            EDHashmapWIthArray ed=new EDHashmapWIthArray();
            ed.getALlAvg(prices);
            ed.getBobAvg(prices,"Bob");
        }
        public void getALlAvg(Map<String, Integer[]> prices){
            Map<String, Integer> avg = new HashMap<String, Integer>();
            for (Map.Entry<String, Integer[]> entry : prices.entrySet()) {
                String key = entry.getKey();
                Integer[] value = entry.getValue();
                int sum=0;
                for (Integer integer : value) {
                    sum = sum + integer;
                }
                int numavg=sum/value.length;
                avg.put(key,numavg);
            }
            System.out.println(avg);
        }
    public void getBobAvg(Map<String, Integer[]> prices,String student){
        Map<String, Integer> avg = new HashMap<String, Integer>();
        Integer[] valueBob=prices.get(student);
        int sum=0;
        for (Integer integer : valueBob) {
            sum = sum + integer;
        }
        int numavg=sum/valueBob.length;
        avg.put(student,numavg);

        System.out.println(avg);
    }

}
