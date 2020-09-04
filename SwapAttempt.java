import java.util.Scanner;

public class SwapAttempt {
    public static void main(String[] args) {
        // get two integers from the user
        Scanner keyboard = new Scanner(System.in);
        int x, y;
        System.out.print("Enter value for x: ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y: ");
        y = keyboard.nextInt();

        // swap values
        int tmp = x;
        x = y;
        y = tmp;

        // show results
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

