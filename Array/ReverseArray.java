public class ReverseArray {
    public static void reverseArray(int numbers[]){
        int first=0, last=numbers.length-1;

        while(first<last){
            //swap
            int temp= numbers[first];
            numbers[first] = numbers[last];
            numbers[last]= temp;
            last--;
            first++;
            
        }
    }
   public static void main(String[] args) {
    int numbers[]= {1,3,5,7,10};
    reverseArray(numbers);
    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
   }
}
