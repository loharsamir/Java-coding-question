import java.util.*;
public class tableOfN {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
    //   for(int i=1;i<=10;i++){
    //     int mul= n*i;
    //     System.out.println(mul);
    int a=4, b=2;
    for(int i=1;i<=n;i++){
        a=a*b;
        System.out.println(a);
    }

        
    }
}
