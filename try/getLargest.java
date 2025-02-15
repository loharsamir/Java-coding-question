import java.util.*;
public class getLargest {
    public static int getLargest(int arr[]){
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("smallest no is "+ smallest);
        return largest;
       
    }

    public static void main(String[] args) {
        int arr[]= {1,4,6,3,2,7,9,5};
        // int largestNO = getLargest(arr);
        System.out.println("largest no is "+getLargest(arr));
    }
}
