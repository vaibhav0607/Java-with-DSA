
package Arrays;



class Sumsub {
    public static void print(int a[]) {
       
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                currsum=0;
                for (int k = i; k <= j; k++) {
                   currsum+=a[k];

                }
                System.out.println(currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }

               
                
            }
        
        }
        System.out.println("Maximum sum of subarrays is=" +maxsum);

    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        print(a);
    }
}