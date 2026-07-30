import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        String b = "";
        for(int i = a.length - 1; i >= 1; i--) {
            b = b + a[i] + " ";
        }
        b = b + a[0];
        return b;
    }
}