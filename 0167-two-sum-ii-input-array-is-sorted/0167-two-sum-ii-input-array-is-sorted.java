class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length < 2) {
            if (numbers[0] == target) {
                result[0] = 1;
                return result;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}