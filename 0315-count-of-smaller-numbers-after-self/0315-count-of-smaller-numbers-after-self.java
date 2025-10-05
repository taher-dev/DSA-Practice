class Solution {
        private int[] counts;

        public List<Integer> countSmaller(int[] nums) {
            int n = nums.length;
            counts = new int[n];
            int[][] pairs = new int[n][2]; // Each pair contains [value, index]

            for (int i = 0; i < n; i++) {
                pairs[i][0] = nums[i];
                pairs[i][1] = i;
            }

            mergeSort(pairs, 0, n - 1);
            List<Integer> result = new ArrayList<>();
            for (int count : counts) {
                result.add(count);
            }
            return result;
        }

        private void mergeSort(int[][] pairs, int left, int right) {
            if (left >= right) {
                return;
            }

            int mid = (left + right) / 2;
            mergeSort(pairs, left, mid);
            mergeSort(pairs, mid + 1, right);
            merge(pairs, left, mid, right);
        }

        private void merge(int[][] pairs, int left, int mid, int right) {
            int[][] temp = new int[right - left + 1][2];
            int i = left, j = mid + 1, k = 0;
            int rightCount = 0;

            while (i <= mid && j <= right) {
                if (pairs[i][0] > pairs[j][0]) {
                    rightCount++;
                    temp[k++] = pairs[j++];
                } else {
                    counts[pairs[i][1]] += rightCount;
                    temp[k++] = pairs[i++];
                }
            }

            while (i <= mid) {
                counts[pairs[i][1]] += rightCount;
                temp[k++] = pairs[i++];
            }

            while (j <= right) {
                temp[k++] = pairs[j++];
            }

            for (int l = 0; l < temp.length; l++) {
                pairs[left + l] = temp[l];
            }
        }
    }