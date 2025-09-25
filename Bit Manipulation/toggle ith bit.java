class Main {
    
    public static void main(String[] args) {
    int n = 0b100100; // 36 decimal
    int i=4;
    int bit=(n^(1<<i));

System.out.print(Integer.toBinaryString(bit)); //110100(52)
}
}
