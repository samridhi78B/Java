import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                System.out.print(a+" ");
                a++;
            }
             System.out.println();
        }
    }
}


// output
// 4
// 1  2  3  4
// 12 13 14 5
// 11 16 15 6
// 10  9  8 7
