class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();

        boolean toggle[] = new boolean[101];
        Arrays.fill(toggle, false);

        for(int i = 0; i < bulbs.size(); i++) {
            if(toggle[bulbs.get(i)] == false) {
                toggle[bulbs.get(i)] = true;
            } else {
                toggle[bulbs.get(i)] = false;
            }
        }

        for(int i = 0; i < 101; i++) {
            if(toggle[i]) result.add(i);
        }

        return result;
    }
}