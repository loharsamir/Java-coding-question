import java.util.Scanner;

public class combination{
    public static int findfactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*= i;
        }
        return fact;
    }
    

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r=sc.nextInt();
        
        int nCr= findfactorial(n)/(findfactorial(r) * findfactorial(n-r));
        System.out.println(nCr);
        
    }
}