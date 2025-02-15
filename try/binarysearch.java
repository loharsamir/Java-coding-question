public class binarysearch {
        public static int binarySearch(int arr[],int key){
            int start=0,end=arr.length;
            while (start<=end) {
                int mid = (start+ end)/2;
                if(arr[mid]==key){
                    return mid;
                }if(arr[mid]>key){
                    end=end-1;
                }else{
                    start=start+1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[] = {1,3,5,6,7,8};
            int key= 2;
            System.out.println(binarySearch(arr, key));
        }
}
