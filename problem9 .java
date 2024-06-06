 class problem9 {
    public static void main(String[] args) 
{
int target = 1000;
 int product = 0;
for (int a = 1; a < target/ 3; a++) {
            for (int b = a + 1; b < target/ 2; b++) {
                int c = target/- a - b;
                if (a * a + b * b == c * c) { 
                    product = a * b * c;
                    break;
                }
            }
        }

        System.out.println("The product of the Pythagorean triplet where a + b + c = 1000 is: " + product);
    }
}
