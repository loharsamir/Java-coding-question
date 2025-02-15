import java.util.*;
public class subArray {
    public static void maxSubArraySum(int arr[]){
        //int curSum = 0;
        int maxSum= Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            // int first=i;
                for(int j=i;j<arr.length;j++){
                //    int last=j;
                    int curSum= 0;
                   for(int k=i;k<=j;k++){
                    curSum = curSum + arr[k];
                    
                   }
                   System.out.println(curSum);
                   if(curSum>maxSum){
                    maxSum = curSum;
                   }
                   
                }
            
        }
        System.out.println("max sum :"+ maxSum);
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,-4,5,-6};
        maxSubArraySum(arr);
    }
}
