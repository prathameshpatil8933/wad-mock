public class patis {
public static void subarrays(int numberss[]){
    int ts=0;
    for (int i = 0; i < numberss.length; i++) {
        int start=i;
      
        for (int j = i; j < numberss.length; j++) {
            int end=j;
            int sum=0;
            for (int k = start; k <=end; k++) {
                System.out.print(numberss[k]+" ");
                sum=numberss[k]+sum;
            }
            System.out.print("Sum of subbaray is "+sum);
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total subbarys "+ ts);
}
    public static void main(String[] args) {
        int numberss[]={2,3,4,5,6};
        subarrays(numberss);
    }
}