public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double one,double two) {
        int oneInt = (int) (one * 1000);
        int twoInt = (int) (two * 1000);
        if (oneInt == twoInt) {
            return true;
        }
        return false;
    }
}
