package Arrays;

public class Maxproduct {
    public static int print(int a[]) {
        int n = a.length;
        int maxsum = Integer.MIN_VALUE;
        int currproduct = 1;
        for (int i = 0; i < n; i++) {
            currproduct = currproduct * a[i];
            maxsum = Math.max(currproduct, maxsum);
            if (currproduct == 0) {
                currproduct = 1;
            }

        }
        currproduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            currproduct = currproduct * a[i];
            maxsum = Math.max(currproduct, maxsum);
            if (currproduct == 0) {
                currproduct = 1;
            }
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int a[] = { 2, 3, -2, 4 };
      
        System.out.println(  print(a));
    }

}
