import java.util.Scanner;


public class PascalTriangle {
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
        // int r=sc.nextInt();

        for(int i=0; i<=n;i++){
            for(int j=1;j<=n-i;j++){
            
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                
                int iCj= findfactorial(i)/(findfactorial(j) * findfactorial(i-j));
                System.out.print(iCj+"   ");
            }
            System.out.println();
        }
    }
}
