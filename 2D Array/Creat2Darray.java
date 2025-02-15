import java.util.*;
public class Creat2Darray{
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    
                    System.out.println("key in ("+i+","+j+")"+"index");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void maximumNumber(int matrix[][]){
        int maxNum= Integer.MIN_VALUE;
        int a=0 ,b=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>maxNum){
                    // System.err.println(i+","+j);
                    maxNum=matrix[i][j];
                    a=i;
                    b=j;
                    
                }
            }
        }
        System.out.println("maximum num is"+maxNum);
        System.out.println("max number index ("+a +","+ b+")");
    }
    public static void main(String[] args) {
        int matrix[][]= new int [3][3];
        //INPUT
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        //OUTPUT
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key = sc.nextInt();
        search(matrix, key);
        maximumNumber(matrix);

  
    }
}