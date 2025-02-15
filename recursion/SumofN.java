public class SumofN {
   public static int sumOfN(int n){
      if(n==1){
          return 1;
      }
      int fn= n+ sumOfN(n-1);
      return fn;
  }
  public static void main(String[] args) {
      int n=5;
      System.out.println(sumOfN(n));
  }
}
