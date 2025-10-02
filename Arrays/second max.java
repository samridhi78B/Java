import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(max < arr[i]) {
               smax= max;
               max= arr[i];
               
           }
            else if(arr[i] > smax && arr[i] < max){
                smax = arr[i];
            }
        }
        
            if (smax == Integer.MIN_VALUE) {
            System.out.println("0"); // or print -1 if problem requires
        } else {
            System.out.println(smax);
        }

        sc.close();
    }
}
