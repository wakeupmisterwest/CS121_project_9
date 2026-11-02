import java.util.Scanner;
import java.util.Random;

public class Guesser{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            System.out.println("");
            System.out.println("0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.println("");
            
            System.out.println("Please enter 0-2: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else if (input == 1) {
                int turns = 0;
                int guess = 0;
                int number = random.nextInt(100);
                
                System.out.println("");
                System.out.println("human guesser");
                while (guess != number) {
                    turns++;
                    
                    System.out.printf("%d) Please enter a number: ", turns);
                    guess = scanner.nextInt();
                    
                    if (guess < number) {
                        System.out.println("too low");
                    } else if (guess > number){
                        System.out.println("too high");
                    } else if (guess == number) {
                        System.out.println("got it!");
                        System.out.println("");
                        System.out.println("Very Good!");
                    }
                }
            } else if (input == 2) {
                int turns = 0;
                int low = 1;
                int high = 100;
                String response = scanner.nextLine();
                
                System.out.println("");
                System.out.println("computer guesser");
                while (!response.equals("c")) {
                    turns++;
                    int mid = low + (high - low ) / 2;

                    System.out.printf("%d), I guess %d", turns, mid);
                    System.out.println("");
                    System.out.printf("Too (H)igh, too (Low), or (C)orrect? ");
                    
                    response = scanner.nextLine();

                    if (response.equals("h")){
                        high = mid - 1;
                    } else if (response.equals("l")) {
                        low = mid + 1;
                    }
                }
            }
        }

        scanner.close();
    }
}