

public class squareroot {

    public static int sqrt() {
        int x = 200;
        if (x < 2) {
            return x;
        }
        long mid = 0;
        long right = x / 2;
        long left = 2;
        while (left <= right) {

            mid = left + (right - left) / 2;

            long num = mid * mid;
            if (num == x) {
                return (int) mid;
            }

            else if (num < x) {
                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return (int) right;
    }

    public static void main(String[] args) {
        int res = sqrt();
        System.out.println(res);
    }
}
