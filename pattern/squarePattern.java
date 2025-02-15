import java.util.*;
public class squarePattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        
        // for(int i=1; i<=n;i++){
           
        //     for (int j=1;j<=n;j++){
        //   if((i==(n/2)+1 || j==(n/2)+1)){
        //     System.out.print("* ");
        //   }else{
        //     System.out.print("  ");
        //   }
           
        // }
        // for(int i=1; i<=n;i++){
           
        //     for (int j=1;j<=m;j++){
        //   if((i==1 || i==n || j==1 || j==m)){
        //     System.out.print("* ");
        //   }else{
        //     System.out.print("  ");
        //   }
           
        // }

        // for(int i=1; i<=n;i++){
           
        //     for (int j=1;j<=n;j++){
        //   if(i==j){
        //     System.out.print("* ");
        //   }else{
        //     System.out.print("  ");
        //   }
           
        // }
        // System.out.println();

        // for(int i=1; i<=n;i++){
           
        //     for (int j=1;j<=n;j++){
        //   if((i+j)>n){
        //     System.out.print("* ");
        //   }else{
        //     System.out.print("  ");
        //   }
           
        // }
        // System.out.println();

        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // int nsp= n-1; int nst=1;
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=nsp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=nst;j++){
        //         System.out.print("* ");
        //     }

        //     nsp--;
        //     nst= nst+2;
        //     System.out.println();
        // }

        // int nsp= 0; int nst=n;
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=nsp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=nst;j++){
        //         System.out.print("* ");
        //     }

        //     nsp++;
        //     nst--;
        //     System.out.println();
        // }

        int nsp= 1; int nst=2*n-3;
        for(int i=1; i<=n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }

            nsp++;
            nst -=2;
            System.out.println();
            
        }



    }

    
}
