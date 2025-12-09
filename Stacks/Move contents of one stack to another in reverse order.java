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
      System.out.println(st);
      
      Stack<Integer> t = new Stack<>();
      while(st.size() > 0){
          t.push(st.pop());
      }
        System.out.println(t);
    }
}

// 5 
//1 2 3 4 5
//[1, 2, 3, 4, 5]
//[5, 4, 3, 2, 1]
