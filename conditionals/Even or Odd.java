import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2  == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}

// output
// 4
// Even

// 7 
// Odd
