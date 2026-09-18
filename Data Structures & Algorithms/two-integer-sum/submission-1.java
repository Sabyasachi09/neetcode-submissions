class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numCounts = new HashMap<>();

        for(int i=0; i < nums.length; i++){ // O(n)
            int targetValue = target - nums[i];
            if(numCounts.containsKey(targetValue)){ // O(1)
                return new int[]{numCounts.get(targetValue), i}; // O(1)
            } else{
                numCounts.put(nums[i], i); // O(1)
            }
        }
        return new int[]{};
    }
}
// Time Complexity: O(n) + O(1) + O(1) + O(1) = O(n)