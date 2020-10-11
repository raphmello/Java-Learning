import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage () {
        Scanner input = new Scanner(System.in);

        long average = 0L;
        double number = 0;
        double counter = 0;
        while (true) {
            boolean hasInt = input.hasNextInt();

            if (hasInt) {
                number = number + input.nextInt();
                counter++;
            } else {
                if (counter == 0) {
                } else {
                    average = Math.round(number / counter);
                }
                System.out.println("SUM = " + (int) number + " AVG = " + average);
                break;
            }

            input.nextLine();

        }

        input.close();
    }
}
