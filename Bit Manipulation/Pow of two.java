
class Main {
    public static boolean isPowOfTwo(int n){
                if(n<=0) return false;
                while(n > 1){
                    if((n & 1) == 1) return false;
                    n = n>> 1;
                }
                return true;

    }
    public static void main(String[] args) {
        int n=32;    
        
        System.out.println(isPowOfTwo(n) ? true : false);
    }
}
