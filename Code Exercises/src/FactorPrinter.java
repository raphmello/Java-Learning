public class FactorPrinter {
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int max = number;
        int divisor = 1;
        String factors = "";
        while (divisor <= max) {
            if (number % divisor == 0){
                factors = factors + " " + divisor;
            }

            divisor ++;
        }

        System.out.println(factors);
    }
}
