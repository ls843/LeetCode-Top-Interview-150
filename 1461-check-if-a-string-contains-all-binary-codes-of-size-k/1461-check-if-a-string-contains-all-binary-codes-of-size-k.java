class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> seen = new HashSet<>();
        int totalSubStrings = 1 << k;

        for(int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            seen.add(sub);

            if(seen.size() == totalSubStrings) {
                return true;
            }
        }

        return false;
    }
}