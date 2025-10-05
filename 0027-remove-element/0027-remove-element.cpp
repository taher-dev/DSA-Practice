class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        sort(nums.begin(), nums.end());
        int k = nums.size();
        int lastIDX = k;
        for (int x : nums) {
            if (x == val) k--;
        }
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                swap(nums[i], nums[lastIDX-1]);
                lastIDX--;
            }
        }
        return k;
    }
};