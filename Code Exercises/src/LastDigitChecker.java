public class LastDigitChecker {
    public static boolean hasSameLastDigit (int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }

        n1 = n1 % 10;
        n2 = n2 % 10;
        n3 = n3 % 10;

        return (n1 == n2) || (n1 == n3) || (n2 == n3);

    }

    public static boolean isValid (int n) {
        return (n >= 10) && (n <= 1000);
    }
}
