class Main 
  {
    public static void main(String[] args) 
      {
        int result = findSmallestMultiple(20);
        System.out.println("Smallest positive number divisible by all numbers from 1 to 20: " + result);
    }

    public static int findSmallestMultiple(int n) 
       {
        int lcm = 1;
            for (int i = 2; i <= n; i++)
         {
            lcm = lcm(lcm, i);
        }

        return lcm;
    }

       public static int lcm(int a, int b) 
       {
        return (a * b) / gcd(a, b);
     }

    public static int gcd(int a, int b) 
     {
        while (b != 0) 
         {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
