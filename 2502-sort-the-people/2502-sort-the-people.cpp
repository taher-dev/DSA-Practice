class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        for(int i = 1; i < heights.size(); i++) {
            int temp = heights[i];
            string tempStr = names[i];

            int j = i-1;
            while (j >= 0 && heights[j] < temp) {
                heights[j+1] = heights[j];
                names[j+1] = names[j];
                
                j--;
            }
            heights[j+1] = temp;
            names[j+1] = tempStr;
        }
        return names;
    }
};