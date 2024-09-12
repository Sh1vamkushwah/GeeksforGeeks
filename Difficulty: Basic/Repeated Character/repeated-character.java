//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    static final int CHAR = 256;
    char firstRep(String S)
    {
        int arr[] = new int[256];
        for( int i = 0 ; i < S.length() ; i++){
            arr[S.charAt(i)]++;
        }
        
        for(int i = 0 ; i < S.length() ; i++){
            if(arr[S.charAt(i)] >= 2){
                return S.charAt(i);
            }
        }
        
        return '#';
    }
}