public class FactorialOfN {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn= n* factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
}
