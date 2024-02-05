package week1_curriculum.class_activity_1;

public class Main {
    public static void main(String[] args) {
        Internship_Form obj1 = new Internship_Form( "Praise", 21, "Male");
        Internship_Form obj2 = new Internship_Form( "Eseosa", 2, "Female");
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age + " Years");
        System.out.println("Gender: " + obj1.gender);
        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age + " Years");
        System.out.println("Gender: " + obj2.gender);
    }
}
