package week1_curriculum.class_activity_1.class_activity_2;

public class OverloadingExample {
    static int add(int a, int b){
        return a + b;
    }
    static float add(int a, int b, float c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a + b;
    }
}
