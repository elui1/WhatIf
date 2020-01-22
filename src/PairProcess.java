import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        int sum;
        int product;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;

        System.out.print("The sum of the two numbers is " + sum);

        if (sum > 200) {
            System.out.print("*");
        }

        if (sum < 1000) {
            System.out.print("~");
        }

        System.out.println();
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The average of the two numbers is " + average);

    }
}
