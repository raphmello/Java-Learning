public class SharedDigit {
    public static boolean hasSharedDigit (int n1,int n2) {
        if ((n1 < 10) || (n1 > 99) || (n2 < 10) || (n2 > 99)) {
            return false;
        }

        int digit11 = n1 / 10;
        int digit12 = n1 % 10;
        int digit21 = n2 / 10;
        int digit22 = n2 % 10;

        if ((digit11 == digit21) ||
                (digit11 == digit22) ||
        (digit12 == digit21) ||
                (digit12 == digit22)) {
            return true;
        }

        return false;
    }
}
