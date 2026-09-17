class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charArrayS = s.toCharArray(); // O(n)
        char[] charArrayT = t.toCharArray(); // O(n)
        Arrays.sort(charArrayS); // O(nLogn)
        Arrays.sort(charArrayT); // O(nLogn)
        String sortedS = new String(charArrayS); // O(n)
        String sortedT = new String(charArrayT); // O(n)
        System.out.println("Sorted S: "+sortedS);
        System.out.println("Sorted T: "+sortedT);
        if(sortedS.equals(sortedT)){ // O(n)
            return true;
        }
        return false;
    }
}
// Time Complexity: O(n) + O(n) + O(nLogn) + O(nLogn) + O(n) + O(n) + O(n) = O(nLogn)