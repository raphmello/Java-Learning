public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int evenDigitSum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                evenDigitSum = (number % 10) + evenDigitSum;
            }
            number = number / 10;
        }

        return evenDigitSum;
    }

}
