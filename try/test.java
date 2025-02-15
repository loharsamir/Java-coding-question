
import java.util.*;
public class test {
  public static boolean isSqr(int n){
    
    int sqr = (int)Math.sqrt(n);
    return n == sqr*sqr;

  }
    public static void main(String[] args) {
      // int a=5 ,b=3;
      // a = a^b;
      // b= a^b;
      // a=a^b;
      // System.out.println(a + " "+b);
     System.out.println(isSqr(9));
     int arr[]={1,4,7,9,8};
     int sum=0;
     for(int i=0;i<arr.length;i++){
      if(isSqr(arr[i])){
        sum+=arr[i];
      }
     }
     System.out.println(sum);

      
    }
}
