import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuBBleSort {

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
	        int temp = 0;  
	         for(i=0; i < n; i++){  
	                 for(j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	               
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	         for(i=0;i<n;i++)
	 		{
	        	 System.out.println(arr[i]);
	 		} 
	    }  
	}


