public class SecondLargest {
    public static int secondLargest(int arr[]){
        int firstLargest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                firstLargest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!= firstLargest &&  arr[i]>secondLargest){
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,6,7,5,8,9,9};
       System.out.println( secondLargest(arr));
    }
}
