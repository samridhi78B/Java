import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 12;
        int count =0;
        while(n>0){
        n=n & (n - 1);
        count++;
        }

        System.out.println(count);
    }
}
