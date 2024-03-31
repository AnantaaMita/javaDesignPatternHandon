public class Main {
   public static void main(String[] args) {
        SingletonEgr se1=SingletonEgr.getSingletonEgr();
        SingletonEgr se2=SingletonEgr.getSingletonEgr();
        System.out.println(se1);
        System.out.println(se2);

        String str="({[]})";
        String SubString1=str.substring(0,str.length()/2);
        String SubString2=str.substring(str.length()/2,str.length());
        String SubString3="";
        for (int i=0; i<SubString2.length(); i++)
        {
            SubString3= SubString3+str.charAt(i);

         }
        System.out.println(SubString1);
        System.out.println(SubString3);
        if(SubString1.equals(SubString3)){
            System.out.println("pass");
        }



    }



}