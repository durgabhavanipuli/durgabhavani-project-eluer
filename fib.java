import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int num = sc.nextInt();

        int first = 1, second = 2;

        System.out.println("fib terms is:");

        for (int i = 0; i < num; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
