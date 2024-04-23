public class Passingarrayasargument_3 {
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        // to pass function argument  two ways
        // pass by value : changes doesn't reflect in main function(calling function)
        //pass by reference: changes reflect in main function(calling function)
        
        //array fall under call by reference 
        //they are passed by refrence changes reflect 



        int marks[]={97,98,99}; 
        update(marks);//function calling time onlt pass name 
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+ " ");
        }
    }
}
