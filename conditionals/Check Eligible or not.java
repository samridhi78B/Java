import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.print("Eligible for vote");
        }
        else{
            System.out.print(" Not Eligible for vote");
        }
    }
}

// output
// 19
// Eligible for vote
