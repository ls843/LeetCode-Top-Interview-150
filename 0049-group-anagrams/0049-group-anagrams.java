class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] words = strs[i].toCharArray();
            Arrays.sort(words);
            String sortedWord = new String(words);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}