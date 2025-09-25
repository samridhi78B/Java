class Main {
    
    public static void main(String[] args) {
        int n=0b100100;
for(int i = 7; i >= 0; i--){
    System.out.print((n >> i) & 1);
}

}
}
