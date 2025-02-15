import java.util.*;
public class inputOutput {
    public static void main(String[] args) {
        //Array syntax
        int marks[] = new int[50];

        //Input of Array 
        Scanner sc = new Scanner(System.in);
       
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        //Output or print of Array
        System.out.println("physics = "+marks[0]);
        System.out.println("math = "+marks[1]);
        System.out.println("chemistry = "+marks[2]);
        System.out.println("lengt of the array="+ marks.length);


        int percentage = (marks[0]+marks[1]+marks[2])/ 3 ;
        System.out.println("percentages = "+percentage +"%");

        //update of Array
        marks[2]= 100;
        marks[0]= marks[0]+2;

        System.out.println("physics = "+marks[0]);
        System.out.println("chemistry = "+marks[2]);
        
        
    }
}
