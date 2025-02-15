public class ReverseArray {
    public static void reverseArray(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,5,7,10};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
