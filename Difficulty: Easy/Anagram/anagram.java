//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution obj = new Solution();

            if (obj.isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()){
            return false;
        }
        
        char a1[] = a.toCharArray();
        Arrays.sort(a1);
        String ans1 = new String(a1);
        
        char a2[] = b.toCharArray();
        Arrays.sort(a2);
        String ans2 = new String(a2);
        
        return ans1.equals(ans2) ;
    }
    
    
}