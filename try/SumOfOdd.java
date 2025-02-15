public class SumOfOdd {
    public static void sumOfEven() {
       int n=10;
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2 == 0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
    public static void sumOfOdd() {
        
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                sum = sum+i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n=10;
        sumOfEven();
        sumOfOdd();
    }
    

}
