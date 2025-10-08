public class Main{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4};
	     int[] arr2 = {2,3,7,8,5};
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr2.length;j++){
	            if(arr[i] == arr2[j]){
	                  System.out.println(arr[i]);
	            }
	        }
	    }

	}
}
