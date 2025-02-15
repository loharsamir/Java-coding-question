public class callByValue {
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a+" "+b);
        swap(a,b);
       
        System.out.println(a+ " "+b);
    }
}
