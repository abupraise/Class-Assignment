package week1_curriculum.class_activity_1.class_exercise5;

public class Teacher implements Teachable {
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}

