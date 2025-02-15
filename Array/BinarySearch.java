public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start= 0 , end = numbers.length;

        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,6,8,20,23,24,25};
        int key= 2;
        System.out.println("index in :" + binarySearch(numbers, key));
    }
}
