import java.util.*;

public class StringCharFrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals(" ")) {
            str = sc.nextLine();
        }
        str = str.toLowerCase().replace(" ", "");
        char[] cArr=str.toCharArray();
        Map<Character,Integer> smap = new HashMap<>();
        for(Character c:cArr){
            if(smap.containsKey(c)){
                smap.put(c,smap.get(c)+1);
            }
            else{
                smap.put(c,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : smap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        System.out.println("list:" +list);
        LinkedHashMap<Character,Integer> sortedMap = new LinkedHashMap<>();
        for (int num : list) {
            for (Map.Entry<Character,Integer> entry : smap.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println("sorted"+sortedMap);
        System.out.println("map" +smap);

    }
}
