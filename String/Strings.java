import java.util.*;
public class Strings{
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     String str1 = "abcd";   
     //or
     String str2 = new String("pqrs");

     //INPUT & OUTPUT
     Scanner sc= new Scanner(System.in);      
     String name = sc.nextLine();
     System.out.println(name);

     //length of string
     String fullName = "Samir lohar";
     System.out.println(fullName.length());

     //concatenaion
     String firstWord="samir";
     String lastWord ="lohar";
     String fullWord = firstWord+" "+lastWord;
     System.out.println(fullWord);

     //charAt method - 
     System.out.println(fullWord.charAt(0));

     //print String
     printString(fullWord);
    }


}
