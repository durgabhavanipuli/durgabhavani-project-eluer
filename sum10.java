 class sum {
    public static void main(String[] args) {
        int limit = 2000000;
        long sum = sum(limit);
        System.out.println("Sum of all primes below " + limit + " is: " + sum);
    }

    public static long sum(int limit) {
        boolean[] isPrime = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
