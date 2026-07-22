package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequentElements(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> bucket = new PriorityQueue<>((a,b) -> frequencyMap.get(a)-frequencyMap.get(b));
        for (int key : frequencyMap.keySet()) {
            bucket.add(key);
            if (bucket.size() > k) {
                bucket.poll();
            }
        }
        int[] calculatedFrequency = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            calculatedFrequency[i] = bucket.poll();
        }
        return calculatedFrequency;

    }

    public static void main(String[] args) {
        TopKFrequentElements f = new TopKFrequentElements();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 5, 5, 1, 1, 1, 1, 6};
        int[] res = f.topKFrequentElements(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}
