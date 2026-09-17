class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charArrayS = s.toCharArray(); // O(n)
        char[] charArrayT = t.toCharArray(); // O(n)
        Arrays.sort(charArrayS); // O(nLogn)
        Arrays.sort(charArrayT); // O(nLogn)
        if(Arrays.equals(charArrayS, charArrayT)){ // O(n)
            return true;
        }
        return false;
    }
}
// Time Complexity: O(n) + O(n) + O(nLogn) + O(nLogn) + O(n) + O(n) + O(n) = O(nLogn)