public class MyArrays {
    // static methods
    public static int even(int[] numbers) {
        int evenNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers += 1;
            }
        }
        return evenNumbers;
    }

    public static int positiveOdd(int[] numbers) {
        int positiveOddNumbers = 0;
        for (int number : numbers) {
            if ((number % 2 == 0) && (number > 0)) {
                positiveOddNumbers += 1;
            }
        }
        return positiveOddNumbers;
    }
}