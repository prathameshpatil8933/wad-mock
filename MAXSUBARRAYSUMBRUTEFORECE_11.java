public class MAXSUBARRAYSUMBRUTEFORECE_11 {
    public static void subarray(int numberss[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
  for (int i = 0; i < numberss.length; i++) {
      int start=i;
      for (int j = i; j < numberss.length; j++) {
          int end=j;
          currsum = 0;
          for (int k = start; k <= end; k++) {
              currsum+=numberss[k];
        }
        System.out.println(currsum);
        if (maxSum< currsum) {
           maxSum=currsum;
        }

    }

  }
  System.out.println("max sum = " +maxSum);
}
 
    public static void main(String[] args) {
        int numberss[]={2,4,6,8,10,12};
        subarray(numberss);
    }
}

// here we have used 3 loops which go till n in each loop
//So the time complexity becomes O(n^3)
//not a good approach 