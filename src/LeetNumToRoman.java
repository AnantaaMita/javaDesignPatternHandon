public class LeetNumToRoman {
    public static void main(String[] args) {
        int s = 58;
        LeetNumToRoman.convertToRoman(s);
        System.out.println(LeetNumToRoman.convertToRoman(s));
    }
    public static String convertToRoman(int num) {

       if(num>1){
           String finalStr="";
           int div,rem;
           div=num/10;
           //if()
           for(int i=0;i<div;i++) {
               finalStr =finalStr+"X";
           }
           rem=num%10;
           if(rem>5){


           }
           return finalStr;
       }
         else {
            return "no Result";
        }
    }

}
