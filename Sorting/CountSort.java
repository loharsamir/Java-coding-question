import java.util.*;
public class CountSort {
    public static void countSort(int arr[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             maxValue = Math.max(maxValue, arr[i]);
        }
        //frequency array
        int count[] = new int[maxValue+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
               arr[j]=i;
               j++;
               count[i]--; 
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,2,5,6,5};
        countSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
