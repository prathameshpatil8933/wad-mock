public class Subarrayhwsum_10 {
    public static void subarray(int numberss[]){
        
          int ts=0;//to count number of sub arrays 
          int msum=Integer.MIN_VALUE;
          int mmsum=Integer.MAX_VALUE;
        for (int i = 0; i < numberss.length; i++) {
            int start=i;
            for (int j = i; j < numberss.length; j++) {
                int end=j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numberss[k]+" ");
                    
                    sum=numberss[k]+sum;
                    if (sum>msum) {
                        msum=sum;
                    }
                    else if (sum<mmsum) {
                        mmsum=sum;
                    }
                }
                System.out.print("Sum of subarray is " + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays ="+ ts);
        System.out.println("Maximium sum is "+ msum);
        System.out.println("Minimium sum is "+ mmsum);
    }
    public static void main(String[] args) {
        int numberss[]={2,4,6,8,10,12};
        subarray(numberss);
    }
}

/*
 * Mistakes i made here is not knowing the scope of varible declared inside the loop
 * Yes, variables declared within a loop in Java are accessible only within that loop's scope. Once the loop finishes 
 * execution, the scope of these variables ends, and they cannot be accessed outside of the loop. This concept is known as 
 * variable scope.
 * 
 */