//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        
        StringBuilder result = new StringBuilder();
        int opened = 0 ;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opened > 0) {
                    result.append(c);
                }
                opened++;
            } else {
                opened--;
                if (opened > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
