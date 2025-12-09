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
      int idx=sc.nextInt();
      int x = sc.nextInt();
      Stack<Integer> t = new Stack<>();
      while(st.size() > idx){
          t.push(st.pop());
      }
      st.push(x);
       while(t.size() > 0){
          st.push(t.pop());
      }
        System.out.println(st);
    }
}

//5
//1 2 3 4 5 
//[1, 2, 3, 4, 5]
// if idx is 3 and (values)x is 7
//[1, 2, 3, 7, 4, 5]
