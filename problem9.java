class triplet {
  public static void main(String[] args) 
    {
     int sum = 1000;
      int product = 0;
        for (int a = 1; a < sum/ 3; a++) {
            for (int b = a + 1; b < sum/ 2; b++) {
                int c = sum- a - b;
                if (a * a + b * b == c * c) { 
                    product = a * b * c;
                    break;
                }
            }
        }

        System.out.println("The product of the Pythagorean triplet where a + b + c = 1000 is: " + product);
    }
}