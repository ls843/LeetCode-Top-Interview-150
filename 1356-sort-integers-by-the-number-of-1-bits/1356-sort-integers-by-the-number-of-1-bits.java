class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);

                if(countA == countB) {
                    return a - b;
                }

                return countA - countB;
            }
        );
        
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int res[] = new int[arr.length];
        int idx = 0;

        while(!pq.isEmpty()) {
            res[idx++] = pq.poll();
        }

        return res;
    }
}