class Main {
    
    public static void main(String[] args) {
        int n = 100100; //36
        int i = 0;

      int bit = (n | (1 << i)) ;
      
     
        System.out.println(bit); //100101 (37)
    }
}
