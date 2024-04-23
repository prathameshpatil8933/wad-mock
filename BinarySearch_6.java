public class BinarySearch_6 {

    public static int binarySearch(int numberss[],int key){
        int start=0;
        int end=numberss.length -1;
        while (start<=end) {
            int mid=(start+end)/2;

            if (numberss[mid]==key) {
                return mid;
            }
            if (numberss[mid]<key) {
                start=mid+1; //as mid is already checked

            }
            else  {
                end=mid-1; //as mid is already checked

            }
        }
        return -1; //this get retruns when element not exist in array
    }
    public static void main(String[] args) {
        //Pre requirment :  Sorted Arrays 
        //should be incr  or  decr   order 
    /*
        start=0       end=n-1

     * take two var start and end 
     * start= index 0      end=last index 
     * mid calculate  (start+end)/2
     * if key > mid  search in right side of mid 
     * if mid>key  search in left side of mid 
     
     * if key > mid  search in right side of mid
     * then assign start and end to the right part
     * here  start=mid-1  as mid we have laready check 
     * and end remains the same  
    * again compare key with mid
     
     * if key < mid  search in left side of mid
     * then assign start and end to the right part
     * here  end=mid-1  as mid we have laready check 
     * and start remains the same  
 
      * again compare key with mid 

      Continute this till get key 

      IN each level array ka size gets reduced n  n/2   n/4   and so on 
     continues till get single element 
      */



        int numbers[]={2,4,6,8,10,12,14};  
        int key=10;
        System.out.println("Index of element is "+ binarySearch(numbers, key));

    }
}
//Time Complexity 

/*
 * Iteration 1      n        n/2^0 
 * Iteration 2      n/2      n/2^1
 * Iteration 3      n/4      n/2^2
 * Iteration 4      n/8      n/2^3

contintues till size gets 1 

n/2^k=1    this will (k+1) iteration

n=2^k
take log borth sides 
k=log 2 n 


Time complexity  proprtional  to   log2 n 
base bot write as no much effect 
Binary Search  TC  O(log n )


Always
Linear Seach TC  >   Binary Seach TC
         n             log n  
 */             
