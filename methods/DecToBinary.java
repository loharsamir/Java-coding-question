import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int bin=0;
        int pow =0;
        while (n>0) {
            int rem = n%2;
            bin= bin+(rem* (int)Math.pow(10, pow));
            pow++;
            n=n/2;   

        }
        System.out.println(bin);

    }
}
