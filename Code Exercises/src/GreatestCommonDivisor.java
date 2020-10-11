public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second <10)) {
            return -1;
        }

        int max = 0;
        if (first > second) {
            max = second;
        } else {
            max = first;
        }

        int gcd = 0;
        int divisor = 1;
        while (divisor <= max) {

            if ((first % divisor == 0) && (second % divisor == 0)) {
                gcd = divisor;
            }

            divisor ++;
        }

        return gcd;

    }
}
