import java.util.*

public class DistinceNumber {
    public static int solution(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                var val = map.get(A[i]);
                val++;
                map.put(A[i], val);
            }
            map.put(A[i], 1);
        }
    }
}