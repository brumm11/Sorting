import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,i,j;
		System.out.println("Enter the Size of the array");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter "+n+" elements");
		int arr[]= new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		} 
		 for (j = 1; j < n; j++) {  
	            int temp = arr[j];  
	            i = j-1;  
	            while ( (i > -1) && ( arr [i] > temp ) ) {  
	                arr[i+1] = arr [i];  
	                i--;  
	            }  
	            arr[i+1] = temp;  
	        } 
		 System.out.println("Sorted Array");
		    for(i=0;i<n;i++)
	 		{
	        	 System.out.println(arr[i]);
	 		} 
	    }  
	}

