package Arrays;

import java.beans.Customizer;

public class Sumsubkaddans {
    public static int print(int a[]) {
      int currsum=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++){
        currsum+=a[i];
        if(currsum>max){
max=currsum;
        }
        if(currsum<0){
            currsum=0;
        }
      }
      return max;

    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
       System.out.println(print(a));
        
    }

}
