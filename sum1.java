import java.util.*;

public class sum1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all multiples of 3 or 5 below 1000 is: " + sum);
    }
}