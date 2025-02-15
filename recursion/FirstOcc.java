public class FirstOcc{
    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length) return -1;
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1 );
    }
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length)return -1;

        int isFind= lastOcc(arr, key, i+1);
        if(isFind==-1 && arr[i]==key){
            return i;
        }
        return isFind;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,6};
        int key=3;
        System.out.println(firstOcc(arr, key, 0));
        System.out.println(lastOcc(arr, key, 0));
    }
}