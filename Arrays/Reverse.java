package Arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        n=r.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=((int)(Math.random()*100)+1);
        }
        System.out.println("Printed arrays elements...");
        for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
        }
        System.out.println();
       
        System.out.println("\nReverse order of arrays...");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
             }
     
    }
}
