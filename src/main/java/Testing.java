import java.util.Random;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome to the Math-Eazi App, " + name + "!");
        System.out.println("Answer the following Maths Questions");

        int score = 0;
        for (int i = 0; i < 5; i++) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int operation = random.nextInt(4);
            double correctAnswer = 0;
            String question = "Question " + (i + 1) + ": ";
            switch (operation) {
                case 0:
                    correctAnswer = number1 + number2;
                    question += number1 + " + " + number2 + " = ";
                    break;
                case 1:
                    correctAnswer = number1 - number2;
                    question += number1 + " - " + number2 + " = ";
                    break;
                case 2:
                    correctAnswer = number1 * number2;
                    question += number1 + " * " + number2 + " = ";
                    break;
                case 3:
                    if (number2 == 0) {
                        number2 = 1;
                    }
                    correctAnswer = (double) number1 / number2;
                    question += number1 + " / " + number2 + " = ";
                    break;
            }
            System.out.print(question);
            double userAnswer = input.nextDouble();

            if (userAnswer == correctAnswer) {
                System.out.println("Amazing! You are right.");
                score++;
            } else {
                System.out.println("Ohhh Nooo. The correct answer is: " + correctAnswer);
            }
        }

        System.out.println(name + ", Your Total Score Is: " + score + "/5");
        input.close();
    }
}