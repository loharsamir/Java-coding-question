public class BinToDec {
    public static void decToBin(int n){
        // int dec= 0;
        // int LastD= 1;
        // for(int pow = 0; pow <=Integer.toString(n).length();pow++){
           int myNum= n;
           int pow=0;
           int dec=0;
           while(n>0){
            int lastDigit = n%10;
            dec = dec +( lastDigit * (int)Math.pow(2,pow));
            pow++;
            n= n/10;
           }
           System.out.println("decimal of "+ myNum +" is " + dec);
        
    }
    public static void main(String[] args) {
        decToBin(111);
    }

    
}
