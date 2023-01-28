package Arrays;



public class m {
    public static int f(int n){
       int a[]=new int [n+1];
       a[0]=0;
       a[1]=1;
       for(int i=2;i<=n;i++){
         a[i]=a[i-1]+a[i-2];
       }
       return a[n];
    }
    public static void main(String[] args) {
       int n=5;
      System.out.println(f(n));
    }
}
