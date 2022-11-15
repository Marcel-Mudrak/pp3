public class Main {
    public static void main(String[] args) {
        // Person
        Person p1 = new Person("Marcel", 16);

        System.out.println(p1.isAdult());
        System.out.println(p1.toString());

        // MyArrays
        int[] array = { 2, -6, 5, 8 };
        int[] array2 = { 3, 2, -5, 4, 1, -7 };

        System.out.println(MyArrays.even(array));
        System.out.println(MyArrays.positiveOdd(array2));

        // Counter
        Counter c = new Counter();

        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());

        // Alphabet

    }
}
