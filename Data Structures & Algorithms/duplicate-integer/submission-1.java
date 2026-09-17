class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> board = new HashMap<>();
        for(int i=0; i < nums.length; i++){ // O(n)
            if(board.containsKey(nums[i])){ // O(1)
                return true;
            }
            else{
                board.put(nums[i], 1); // O(1)
            }
        }
        return false;
    }
}

// Time Complexity: O(n) + O(1) + O(1) = O(n)