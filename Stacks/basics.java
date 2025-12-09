import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    int n =sc.nextInt();
      for(int i=0;i <n;i++){
          int x = sc.nextInt();
          st.push(x);
      }
      System.out.print(st);
    }
}



//5
//1 2 3 4 5
// output 
// [1, 2, 3, 4, 5]
