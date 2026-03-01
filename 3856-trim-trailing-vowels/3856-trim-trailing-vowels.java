class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        for(int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                sb.deleteCharAt(i);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}