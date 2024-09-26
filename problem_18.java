 import java.util.Scanner;

    public class problem_18 {
    public static int countDivisors(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " "); // print the divisor
                count++;
            }
        }
        System.out.println(); // new line
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        int divisors = countDivisors(N);
        System.out.println("Number of divisors of " + N + ": " + divisors);
    }
}

