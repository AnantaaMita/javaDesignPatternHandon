public class StarPrint {
    public static void main(String [] args) {
    for(int i=0;i<4;i++){
        String star="";
        for(int k=0;k<=i;k++){
            star=star+'*';
        }
        System.out.println(star); System.out.println("\n");
    }
    }
}
