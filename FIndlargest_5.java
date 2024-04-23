public class FIndlargest_5 {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest<numbers[i]) {
                largest=numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest=numbers[i];
             
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        /*approach 
        largest me -infinity store 
        then compare each index element
        if value at indec grreater than largest
        put that value in largest 
        in this way traverse the whole array  */
    
        // -infinity    Integer.MIN_VALUE
        // +infinity    Integer.MAX_VALUE
        //present in utility package

        int numbers[]={1,2,6,3,5};
    System.out.println("Largest value is "+ getLargest(numbers));
    }
}
