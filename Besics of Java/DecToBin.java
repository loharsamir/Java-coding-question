public class DecToBin {
    public static void binToDec(int n){
        int myNum= n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem= n%2;
            bin = bin + (rem* (int)Math.pow(10, pow));
            pow++;
            n=n/2;
            
        }
        System.out.println("decimal of "+ myNum + " is "+ bin );
    }
    public static void main(String[] args) {
        binToDec(10);
    }
}
