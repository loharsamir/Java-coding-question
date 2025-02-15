import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;
        int power =0;
        while(n!=0){
            int lastDigit =n%10;
            dec = dec+(lastDigit * (int)Math.pow(2, power));
            power++;
            n=n/10;

        }
        System.out.println(dec);
    }
}
