public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int reversedNumber = reverse(number);
            int digits = getDigitCount(number);
            int count = 0;
            while (count != digits) {

                switch ((reversedNumber % 10)) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("OTHER");
                }

                reversedNumber = reversedNumber / 10;
                count++;
            }
        }
    }

    public static int getDigitCount (int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        while (n / 10 != 0) {
            count++;
            n = n / 10;
        }
        count++;
        return count;

    }

    public static int reverse (int number) {
        int returnNegative = 1;
        if (number < 0) {
            number = number * -1;
            returnNegative = -1;
        }

        int whileNumber = number;
        int reverseNumber = 0;
        int digit = 0;

        while (whileNumber > 0) {
            digit = whileNumber % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            whileNumber = whileNumber / 10;
        }


        return (reverseNumber * returnNegative);
    }

}
