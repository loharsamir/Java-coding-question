public class PairsArray {

    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int first=arr[i];
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("("+first+","+arr[j]+")");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,6,7,9};
        pairs(arr);
    }
}
