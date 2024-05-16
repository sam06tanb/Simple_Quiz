import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean CorrectAnswer = false;

        System.out.println("Samir quiz, do you want to continue?(Y/N)");
        String Answer0 = sc.nextLine();

        if (Answer0.equals("Y")) {
            int[] results = new int[3];

            while (!CorrectAnswer) {
                try {
                    System.out.println("When did the first world war ended?");
                    int answer1 = sc.nextInt();
                    if (answer1 == 1918) {
                        System.out.println("Right!");
                        results[0] = 1;
                    } else {
                        System.out.println("Wrong!");
                        results[0] = 0;
                    }

                    System.out.println("When did the second world war ended?");
                    int answer2 = sc.nextInt();
                    if (answer2 == 1945) {
                        System.out.println("Right!");
                        results[1] = 1;
                    } else {
                        System.out.println("Wrong!");
                        results[1] = 0;
                    }

                    System.out.println("When did the cold War started?");
                    int answer3 = sc.nextInt();
                    if (answer3 == 1947) {
                        System.out.println("Right!");
                        results[2] = 1;
                        CorrectAnswer = true;
                    } else {
                        System.out.println("Wrong!");
                        results[2] = 0;
                    }
                    System.out.println("\nResults:");
                    System.out.println("Question 1: " + (results[0] == 1 ? "Correct" : "Incorrect"));
                    System.out.println("Question 2: " + (results[1] == 1 ? "Correct" : "Incorrect"));
                    System.out.println("Question 3: " + (results[2] == 1 ? "Correct" : "Incorrect"));
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Only numbers allowed");
                    sc.next();
                }
            }
        } else {
            System.out.println("Bye!");
        }
        sc.close();
    }
}

