public class fibonacci {
    public static int fibonacci(int n){
        if(n==0){
           return 0;
        }if(n==1){
            return 1;
        }
        int fbn= fibonacci(n-1) + fibonacci(n-2);
        return fbn;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibonacci(n));
    }
}
