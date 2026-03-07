import java.util.HashMap;

public class containsduplicates {
    public static boolean containsmatch() {
        int[] nums = { 1, 2, 3, 4, 1 };
        HashMap<Integer, Integer> checking = new HashMap<Integer, Integer>();
        int i = 0;

        int count;

        while (i < nums.length) {
            count = 0;

            // checking.put(nums[i], ++count);
            if (checking.containsKey(nums[i])) {
                count = checking.get(nums[i]);
            }
            count++;
            checking.put(nums[i], count);
            if (count > 1) {
                return true;
            }

            i++;

        }

        return false;
    }

    public static void main(String[] args) {
        boolean res = containsmatch();
        System.out.println(res);
    }
}