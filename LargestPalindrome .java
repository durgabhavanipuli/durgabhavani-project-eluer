public class LargestPalindrome {
    public static void main(String[] args) {
        int largestPalindrome = findLargestPalindrome();
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
    }

    public static int findLargestPalindrome() {
        int maxPalindrome = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (product < maxPalindrome) {
                    // No need to continue, as further products will be smaller
                    break;
                }
                if (isPalindrome(product)) {
                    maxPalindrome = product;
                }
            }
        }