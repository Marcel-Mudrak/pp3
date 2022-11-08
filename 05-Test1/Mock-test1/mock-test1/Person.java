public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    
    public static void main(String[] args) {
        Person p = new Person("Marcel", 21);
        
        System.out.println(p.getAge());
    }
}