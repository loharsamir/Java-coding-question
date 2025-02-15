public class powerOfN {
    public static int pow(int a, int b){
        // if(b==1)return a;
        // return a* pow(a, b-1);
        if(b==0)return 1;
        int mul= pow(a, b/2);
        int ans = mul*mul;
        
        if(b%2!=0) ans= a*ans;
        return ans;
    }

    public static void main(String[] args) {
        int a=2,b=4;
       System.out.println( pow(a,b));
    }
}
