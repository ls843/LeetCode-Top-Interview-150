class Solution {
    public int minPartitions(String n) {
        int max = 0;

        for(char num : n.toCharArray()) {
           max = Math.max(max, num - '0');
        }

        return max;
    }
}