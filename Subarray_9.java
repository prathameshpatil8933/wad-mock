public class Subarray_9 {
    public static void subarray(int numberss[]){
        
          int ts=0;//to count number of sub arrays 
        for (int i = 0; i < numberss.length; i++) {
            int start=i;
            for (int j = i; j < numberss.length; j++) {
                int end=j;
                
                for (int k = start; k <= end; k++) {
                    System.out.print(numberss[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays ="+ ts);
    }
    public static void main(String[] args) {
        int numberss[]={2,4,6,8,10,12};
        subarray(numberss);
    }
}
/*
 * Try to calcualte sum of subarrays   suppose for subarray 2,4,6 sum =10
 * 4,6,8  ka sum = 18 
 * Calculate this sum and also find min and max sum 
 */