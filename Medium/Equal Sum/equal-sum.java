//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        
        int sum = 0 ; 
        for( int i = 0 ; i < n ; i ++){
            sum= sum + arr[i];
        }
        
        int ind = 0 ;
        
        int count = 0;
        for(int i = 0 ; i < n ; i ++){
            count = arr[i] + count;
            if((count - arr[i]) == (sum - count)){
                ind = ind + 1;
                break;
            }
        }
        String ans ;
        if(ind == 1){
            ans = "YES";
        }else{
            ans = "NO";
        }
        
        return ans ;
    }
}