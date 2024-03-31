import java.util.Arrays;
import java.util.Scanner;

public class ArrayHandson {
    /*public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        *//*int a = scan.nextInt();
        int[] arr=new int[10];  ;
        for(int i=0;i<a;i++){
           // System.out.println(i);
            arr[i]= scan.nextInt();
            //System.out.println(arr[i]);
        }
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr);
        scan.close();*//*

        int i = scan.nextInt();
        double d = scan.nextDouble();
        *//*StringBuilder age = new StringBuilder();
              age= new StringBuilder(scan.nextLine());*//*
        String s=scan.nextLine();
        if(s.equals("")){
            s=scan.nextLine();
        }

        // Write your code here.

        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
        scan.close();
    }*/
    public static void main(String[] args){
       /* Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);*/
        Scanner sc=new Scanner(System.in);
        //int aliLen=sc.nextInt();
        //int bobLen=sc.nextInt();
        int[] aliArr=new int[3];
        int[] bobArr=new int[3];

        for(int i=0;i<3;i++){
            aliArr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            bobArr[i]=sc.nextInt();
        }
        sc.close();
        int ali=0,bob=0;
        int[] result=new int[2];
        for(int i=0;i<3;i++){
            if(aliArr[i]>bobArr[i]){
                ali=ali+1;
            }
            else if(aliArr[i]<bobArr[i]){
                bob=bob+1;
            }
        }
        result[0]=ali;
        result[1]=bob;

        String str= Integer.toString(ali) +" "+ Integer.toString(bob);

        System.out.println(str);
    }
}

