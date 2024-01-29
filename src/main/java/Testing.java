import java.util.Random;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to the Mathiz App, " + name + "!");
        int score = 0;
        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int operation = random.nextInt(4);
            double correctAnswer = 0;
            String question = "Question " + (i + 1) + ": ";
            switch (operation) {
                case 0:
                    correctAnswer = a + b;
                    question += a + " + " + b;
                    break;
                case 1:
                    correctAnswer = a - b;
                    question += a + " - " + b;
                    break;
                case 2:
                    correctAnswer = a * b;
                    question += a + " * " + b;
                    break;
                case 3:
                    if (b == 0) {
                        b = 1;
                    }
                    correctAnswer = (double) a / b;
                    question += a + " / " + b;
                    break;
            }
            System.out.println(question);
            double userAnswer = input.nextDouble();
            if (userAnswer == correctAnswer) {
                score++;
            }
        }
        System.out.println(name + ", your final score is: " + score + "/5");
        input.close();
    }
}
