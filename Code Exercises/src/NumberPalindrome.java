public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
       if (number < 0) {
           number = number * -1;
        }

       int whileNumber = number;
       int reverseNumber = 0;
       int digit = 0;

       while (whileNumber > 0) {
           digit = whileNumber % 10;
           reverseNumber = (reverseNumber * 10) + digit;
           whileNumber = whileNumber / 10;
        }


       return (number == reverseNumber);
    }
}
