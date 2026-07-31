import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] b = nums.clone();
        Arrays.sort(b);
        HashSet<Integer> a = new HashSet<>();
        for (int i=0;i<b.length;i++) {
            a.add(b[i]);
        }
        int i = 1;
        while (true) {
            if (!a.contains(i)) {
                return i;
            }
            i++;
        }
    }
}