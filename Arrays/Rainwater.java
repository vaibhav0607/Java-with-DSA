package Arrays;

public class Rainwater {
    public static int Trappedwater(int height[]) {
        int n = height.length;

        // leftmax boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        // rightmax boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max( rightmax[i + 1],height[i]);
        }
        // loop
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {// water level=min(leftmax,rightmax)
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(Trappedwater(height));
    }

}
