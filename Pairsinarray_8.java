public class Pairsinarray_8 {
    public static void printpairs(int numberss[]){
/*

for (int i = 0; i < numberss.length; i++) {
    for (int j = i+1; j < numberss.length; j++) {
        System.out.print(numberss[i]);
        System.out.print(numberss[j]);
        System.out.println();
    }
}    sout can't do like  System.out.print(numberss[i],numberss[j]);
    */
    int tp=0;
    for (int i = 0; i < numberss.length; i++) {
     int current=numberss[i];
        for (int j = i+1; j < numberss.length; j++) {
    System.out.print("(" + current + ","+ numberss[j] +") ");
                 tp++;
    }
    System.out.println();
}
System.out.println("Total pairs "+ tp);
    }
    public static void main(String[] args) {
        /*
         * Calculate all possible pairs in the array    2 numbers ki pair 
         * khud ke sath not pair 
         * we have elements  2  4  6  8  10 
         * possible pairs 
         *  2,4  2,6  2,8  2,10
         *  4,6  4,8  4,10
         *  6,8  6,10
         *  8,10
         
         *  2,4  and   4,2 are equal   
         */

        int numbers[]={2,4,6,8,10};
        printpairs(numbers);




    }
}
