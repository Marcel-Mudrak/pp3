public class Person {
    // attributes
    private String name;
    private int age;

    // methods
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return (this.name + ", " + this.age);
    }

    public boolean isAdult() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // getter and setter methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Marcel", 16);

        System.out.println(p1.isAdult());
    }
}