import java.util.*;
public class functions {
    public static int printSum(int a,int b){
       int sum = a+b;
       return sum;
    }
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
   
    //    int sum =  printSum(a, b);
    //     System.out.println("sum:"+sum);
    //     System.out.println("product of a and b =" +multiply(a,b));
    int prod = multiply(3,5);
    System.out.println(prod);
    }

    
}
