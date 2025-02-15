public class PairsInArray {
    public static void pairArray(int numbers[]){
        int totalpair=0;
        for(int i=0;i<numbers.length;i++){
            int curr= numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+totalpair);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        pairArray(numbers);

    }
    
}
