import java.util.*;
public class kadanes {
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<arr.length;i++){
            curSum += arr[i];
            maxSum= Math.max(maxSum, curSum);
            if(curSum<0){
                curSum=0;
            }
           
        }
        System.out.println("maximum sum ="+maxSum);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,-4,5,5};
        kadanes(arr);
    }
}
