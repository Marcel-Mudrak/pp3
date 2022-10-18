public class Student{
    // Object attributes
    
    String name;
    int age;
    String id_card;
    boolean is_id_valid;
    int semester_num;
    double avg_grade;
    
    // Object methods
    
    public void sayHello(){
        System.out.println("hello");
    }
    
    public void displayName(){
        System.out.println("My name is " + name);
    }
    
    public void displayAge(){
        System.out.println("My age is " + age);
    }
    
    public void showInfo(){
        System.out.println("Name: " + name + "\nSemester number: " + semester_num + "\nAverage grade: " + avg_grade);
    }
    
    public void changeIdValidation(){
        is_id_valid = !is_id_valid;
    }
    
    public void showIdInfo(){
        System.out.println("Name: " + name + "\nId card number: " + id_card + "\nIs ID valid: " + is_id_valid);
    }
    
    
    // Main function
    
    public static void main(String[] args){
        
        // Student 1 definition
        Student student1 = new Student();
        
        student1.name = "Wojtek";
        student1.age = 25;
        student1.id_card = "222054";
        student1.is_id_valid = false;
        student1.semester_num = 2;
        student1.avg_grade = 3.74;
        
        student1.showInfo();
        System.out.println("\n---\n");
        student1.showIdInfo();
        System.out.println("\n---\n");
        student1.changeIdValidation();
        student1.showIdInfo();
    }
}