public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L; 
        long largestPrimeFactor = findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor);
    }

    public static long findLargestPrimeFactor(long n) {
        long largestPrime = 0;
        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
       }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }
        
               if (n > 2) {
            largestPrime = n;
        }
        
        return largestPrime;
    }
}
