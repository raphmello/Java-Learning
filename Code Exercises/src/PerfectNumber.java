public class PerfectNumber {
    public static boolean isPerfectNumber (int n) {
        if (n < 1) {
            return false;
        }

        int maxDivisor = n - 1;
        int divisor = 1;
        int sumOfDivisors = 0;

        while (divisor <= maxDivisor) {
            if (n % divisor == 0){
                sumOfDivisors += divisor;
            }
            divisor++;
        }

        return sumOfDivisors == n;
    }
}
