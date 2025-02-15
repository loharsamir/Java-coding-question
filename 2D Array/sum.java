public class sum {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int arr3[][]= new int[2][arr2.length];
        for(int i=0;i<2;i++){
            for(int j=0;j<arr2.length;j++){
                arr3[i][j]=arr1[j];
                if(i==1){
                    arr3[i][j]=arr2[j];
                }
            }
            
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
               System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
