//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) {
        int right[]  = new int[n];
        
        int left[]   = new int[n];
        
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        
        for( int i = 1 ; i < n ; i++){
            left[i] = Math.min(arr[i] , left[i-1]);
        }
        
        for( int j = n-2 ; j >= 0 ; j--){
            right[j] = Math.max(arr[j] , right[j+1]);
        }
        
        int i = 0, j =0;  
        int ans = Integer.MIN_VALUE;
        
        while(j < n && i < n){
            if(left[i] <= right[j]){
                ans = Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        
        return ans;
    }   
}


