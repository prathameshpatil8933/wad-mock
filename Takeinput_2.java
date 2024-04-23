import java.util.Scanner;

public class Takeinput_2 {
    public static void main(String[] args) {
        int marks[]=new int[100];
    //to take input 
    Scanner sc=new Scanner(System.in);
    //int phy=sc.nextLine();
    

    //marks[0],mark[1] are array variables 
    marks[0]=sc.nextInt(); //phy
    marks[1]=sc.nextInt(); //chem

    System.out.println("phy "+ marks[0]);
    System.out.println("chem "+marks[1]);

    marks[1]=100;
    System.out.println("chem "+ marks[1]);

    marks[2]=marks[2]+1;

    int percentage=(marks[0]+marks[1]+marks[2])/3;
    System.out.println("Percentaage is "+ percentage +"%");

    //to calculate length of array 
    System.out.println("LEngth of array " + marks.length);
    }
}
