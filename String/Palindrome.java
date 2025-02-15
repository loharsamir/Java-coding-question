public class Palindrome{
    public static boolean checkPalinedrome(String str){
        int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("not palindrome");
                return false;
            }
        }
        System.out.println("palindrome");
        return true;
    }
    public static void main(String[] args) {
        String word ="malayalam";
       checkPalinedrome(word);
    }
}