import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(i);
            }
             System.out.println();
        }
    }
}

// output
// 5
// 1
// 22
// 333
// 4444
// 55555
