class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        for (int i = s.size()-1; i > -1; i--) {
            if (s[i] == ' ') {
                if (count > 0) return count;
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
};