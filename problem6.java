 public class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;

        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int squareOfSum = sum * sum;

        int difference = squareOfSum - sumOfSquares;
        System.out.println("The difference is: " + difference);
    }
}