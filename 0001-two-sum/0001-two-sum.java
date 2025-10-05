class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2) {
            if (nums[0] == target) {
                result[0] = 0;
                return result;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}