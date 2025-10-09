public class Main
{
	public static void main(String[] args) {
	    int[] arr={2,7,11,15};
	    int target=26;
		int st=0,end=arr.length-1;
		while(st<end){
		    int pairSum = arr[st] + arr[end];
		    if(pairSum < target){
		        st++;
		    } 
		    else if(pairSum > target){
		        end--;
		    } 
		    else{
		       	System.out.print(arr[st] + " " + arr[end]); 
		       	break;
		    }
		}
		    
	
		}
		
	}

