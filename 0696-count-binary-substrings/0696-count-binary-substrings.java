class Solution {
    public int countBinarySubstrings(String s) {
        int prevGroup = 0, currGroup = 1;
        int count = 0;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {
                count += Math.min(currGroup, prevGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        count += Math.min(currGroup, prevGroup);        
        return count;
    }
}