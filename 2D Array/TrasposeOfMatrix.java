// Write a program to FindTransposeofa Matrix
public class TrasposeOfMatrix{
    
    public static void tranposeOfMatrix(int matrix[][]){
        int row =2 , column= 3;
        int transposeMatrix[][]= new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transposeMatrix[j][i]=matrix[i][j];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]= { {2,3,7}, {5,6,7} };
        tranposeOfMatrix(matrix);
    }
}
