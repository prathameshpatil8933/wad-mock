public class LinearSearch_4 {
    public static int LinearSearch(int numberss[],int key){

for (int i = 0; i < numberss.length; i++) {
    if (numberss[i]==key) {
        return i;
    }
}

        return -1;
    }
    public static void main(String[] args) {

        //find index of elemnt in array 
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=LinearSearch(numbers, key);
        // to pass array as argument just pass arr name

        if (index== -1) {
            System.out.println("Element is not present in the array ");
        }
        else{
            System.out.println("KEy at the index "+index);
        }
    }
}
//TIme Complexity of LInear Seach is O(n)
//as n time the loop runs to find an element 
