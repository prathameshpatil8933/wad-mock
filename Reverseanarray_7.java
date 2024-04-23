public class Reverseanarray_7 {
    public static void reverse(int numberss[]){
int first =0, last=numberss.length-1;

    //Here we have not taken as while(first<=last)
    //beacuse then last and first will be pointing same element
    //and there is no sense in swapping that element with that element
    while (first<last) {
        //swap the values 
        int temp=numberss[last];
        numberss[last]=numberss[first];
        numberss[first]=temp;
            first++;
            last--;
    }

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        System.out.println("Original Array ");
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array ");
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

    }
}
/*  For reversing an array one approach is create one another array
loop in reverse order and store the elements 
then copy this values in original array 

TC O(n)  as whole array need to be traverse 
SC O(n)  as new array is used 

SC = O(1)  const   if no extra space is used in same array only reverse order

First   lasst  
FIrst and last pointed elements swap 
then increase  first by 1   and  reduce last by 1 

 */