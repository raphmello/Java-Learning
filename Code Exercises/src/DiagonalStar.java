public class DiagonalStar {

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            int rowMax = number;
            int columnMax = number;

            for (int i = 1; i <= number; i++) {
                for (int ii = 1; ii <= number; ii++) {
                    if ((i == 1) || (i == number) || (ii == 1) || (ii == number) || (i == ii) || (ii == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

    }

}
