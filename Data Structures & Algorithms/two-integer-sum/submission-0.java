class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numCounts = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int targetValue = target - nums[i];
            if(numCounts.containsKey(targetValue)){
                return new int[]{numCounts.get(targetValue), i};
            } else{
                numCounts.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
