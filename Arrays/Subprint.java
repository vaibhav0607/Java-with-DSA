
package Arrays;

class Subprint {
    public static void print(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");

                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays is=" + count);

    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        print(a);
    }
}