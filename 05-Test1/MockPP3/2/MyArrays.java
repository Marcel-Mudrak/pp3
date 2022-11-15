public class MyArrays {

    public static int even(int[] array) {
        int evenNumbers = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbers += 1;
            }
        }
        return evenNumbers;
    }

    public static int positiveOdd(int[] array) {
        int positiveOddNumbers = 0;
        for (int number : array) {
            if (number >= 0 && number % 2 != 0) {
                positiveOddNumbers += 1;
            }
        }
        return positiveOddNumbers;
    }
}
