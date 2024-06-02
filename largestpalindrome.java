public class largestpalindrome{
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int product;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        
        System.out.println("The largest palindrome of product is: " + largestPalindrome);
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int Number = number;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return Number == reverse;
    }
}