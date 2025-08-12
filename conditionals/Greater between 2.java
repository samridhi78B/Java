import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x == y){
            System.out.print("Equal");
        }
        else if(x > y){
            System.out.print("x is greater");
        }
        else{
            System.out.print("y is greater");
        }
    }
}


// output
// 2 2
// Equal

// 3 2
// x is greater

// 2 3
// y is greater
