public class callByReff {
    public static void update(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {99,98,97};
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[1]);
        }
        
    }
}
