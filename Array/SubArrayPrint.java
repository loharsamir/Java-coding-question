public class SubArrayPrint {
    public static void printSubArray(int numbers[]){
       
        int MaxValu = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
             int start= i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int currSum=0;
                for(int k=start; k<=end;k++){
                   currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum>MaxValu){
                    MaxValu=currSum;
                }
              
            }
        }
        System.out.println("maxmimum value = "+MaxValu);
    }

    public static void kadanes(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
            
        for(int i=0;i<numbers.length;i++){
            cs= cs+ numbers[i];
            ms= Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
            
        }
        System.out.println("our maximum sub Array Sum is ="+ ms);
    }
    public static void main(String[] args) {
        int numbers[]= {-2,-3,-4,-1,-2,-1,-5,3};
        kadanes(numbers);
    }
}
