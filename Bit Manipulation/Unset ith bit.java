class Main {
    
    public static void main(String[] args) {
  int n = 32;
int i = 4; 
int bit = n & ~(1 << i);
System.out.print(Integer.toBinaryString(bit));

}
}
