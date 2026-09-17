class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        HashMap<Character, Integer> sArrayCount = new HashMap<>();
        HashMap<Character, Integer> tArrayCount = new HashMap<>();

        for(int i=0, j=0; i < charArrayS.length && j < charArrayT.length; i++, j++){ // O(n)
            if(sArrayCount.containsKey(charArrayS[i])){ // O(1)
                int newCount = sArrayCount.get(charArrayS[i]) + 1;
                sArrayCount.put(charArrayS[i], newCount); // O(1)
            }else {
                sArrayCount.put(charArrayS[i], 1); // O(1)
            }

            if(tArrayCount.containsKey(charArrayT[j])){ // O(1)
                int newCount = tArrayCount.get(charArrayT[j]) + 1;
                tArrayCount.put(charArrayT[j], newCount); // O(1)
            } else{
                tArrayCount.put(charArrayT[j], 1); // O(1)
            }
        }

        for(Map.Entry<Character, Integer> entry : sArrayCount.entrySet()){ // O(n)
            if(tArrayCount.containsKey(entry.getKey())){
                if(!tArrayCount.get(entry.getKey()).equals(entry.getValue())){ // O(1)
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
// Time Complexity: O(n) + O(1) + O(1) + O(1) + O(1) + O(1) + O(n) + O(1) = O(n)