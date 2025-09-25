// MTHOD1
// class Main {
//     public static boolean isPowOfTwo(int n){
//                 if(n<=0) return false;
//                 while(n > 1){
//                     if((n & 1) == 1) return false;
//                     n = n>> 1;
//                 }
//                 return true;

//     }
//     public static void main(String[] args) {
//         int n=32;    
        
//         System.out.println(isPowOfTwo(n) ? true : false);
//     }
// }

// METHOD2 (pROPERTY)

class Main {
    public static void main(String[] args) {
        int n = 12;
        String result = (n > 0 && (n & (n - 1)) == 0) ? "TRUE": "FALSE";

        System.out.println(result);
    }
}
