import java.util.*;
public class primeOrNot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n= sc.nextInt();
       boolean isPrime= true;
       for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                isPrime= false;
                break;

            }
       }
       if(n==1){
        System.out.println("niither prime nor composite");
       }
       else if(isPrime==true){
        System.out.println("prime number");
       }else{
        System.out.println("composite number");
       }
    }
}
