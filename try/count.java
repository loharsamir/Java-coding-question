import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int m=n;
        int sum =0;
        int rev=0;
        while(n!=0){
            int lastDigit=n%10;
            // if(lastDigit%2==0){
            //   sum=sum+lastDigit; 
            // }
            rev=(rev*10)+lastDigit;
            n=n/10;           
            
        }
        System.out.println(rev+m);
    }
}

