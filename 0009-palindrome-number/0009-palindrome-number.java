class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String revStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }

        if(str.equals(revStr)) {
            return true;
        } else {
            return false;
        }
    }
}