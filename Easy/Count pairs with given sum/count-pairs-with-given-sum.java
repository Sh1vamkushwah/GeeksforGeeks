//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int target) {
        
        int count = 0 ;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            int diff = target - arr[i];
            
            if(hmap.containsKey(diff)){
                count = count + hmap.get(diff);
            }
            
            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i],1);
            }
            else{
                hmap.put(arr[i] , hmap.get(arr[i])+1);
            }
        }
        return count ;
    }
}
