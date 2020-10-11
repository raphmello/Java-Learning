public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        //big = 5kg
        //small = 1kg

        if ((bigCount < 0) || (smallCount < 0)) {
            return false;
        }

        int sum = 0;

        while (goal >= 5 && bigCount != 0) {
            sum = sum + 5;
            bigCount--;
            goal = goal - 5;
        }

        while (goal >= 1 && smallCount != 0) {
            sum = sum + 1;
            smallCount--;
            goal = goal - 1;
        }

        return (goal == 0);
    }
}
