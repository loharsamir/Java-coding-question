public class largestInArray {
    public static int findLargest(int numbers[]){
        int largestNum = Integer.MIN_VALUE;

        for(int i=0 ;i<numbers.length;i++){
            if(numbers[i]>largestNum){
                largestNum= numbers[i];
            }
        }
        return largestNum;
    }

    public static int findSmallest(int numbers[]){
        int smallNum = Integer.MAX_VALUE;

        for(int i=0 ;i<numbers.length;i++){
            if(numbers[i]<smallNum){
                smallNum= numbers[i];
            }
        }
        return smallNum;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,6,4,5};
       System.out.println( findLargest(numbers));
       System.out.println( findSmallest(numbers));
    }
}
