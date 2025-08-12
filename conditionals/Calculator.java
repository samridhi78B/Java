import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.print(x+y);
                break;
                
            case '-':
                System.out.print(x-y);
                break;
                
            case '*':
                System.out.print(x*y);
                break;
                
            case '/':
                if(y != 0){
                    System.out.print(x/y);
                }
                else{
                    System.out.print("Error! Division by zero");
                }
                break;
                  
            default:
                System.out.print("Invalid");
                break;
        }
    }
}



// output
// 4 5 +
// 9

// 4 5 *
// 20 

// 7 4 / 
// 1

// 4 0 /
// Error! Division by zero

// 4 5 $
// Invalid 
  
