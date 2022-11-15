public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAage(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isAdult() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
        
    }

    public String toString() {
        return this.name + "," + this.age;
    }

    // public static void main(String[] args) {
    //     Person p1 = new Person("Marcel", 16);

    //     System.out.println(p1.isAdult());
    //     System.out.println(p1.toString());
    // }
}
