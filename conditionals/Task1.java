import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.print("Hello");
                break;
                
            case 2:
                System.out.print("Namaste");
                break;
                
            case 3:
                System.out.print("Bonjour");
                break;
                
            default:
                System.out.print("Invalid");
                break;
        }
    }
}


// output
// 1
// Hello  

  
// 2
// Namaste

  
// 3
// Bonjour


  
// 10 
// Invalid
