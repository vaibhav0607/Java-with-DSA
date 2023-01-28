package Arrays;

public class pairs {
   

        public static void print1(int a[]) {
            int count=0;
            for (int i = 0; i < a.length; i++) {
                int curr = a[i];
                for (int j = i+1; j < a.length; j++) {
             System.out.print("("+curr+","+a[j]+")");
             count++;
                }
                System.out.println();
    
            }
            System.out.println("total pairs is="+count);
        }
    
        public static void main(String[] args) {
            int a[] = { 2, 4, 6, 8, 10 };
            print1(a);
        }
    }
    

