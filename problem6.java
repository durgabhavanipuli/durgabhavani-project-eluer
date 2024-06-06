 class problem6
 {
public static void main(String[] args) 
{
  int sum Of Squares = 0;
    for (int i = 1; i <= 100; i++)
 {
      sum Of Squares += i * i;
  }

        int sum Of Natural Numbers = 0;
        for (int i = 1; i <= 100; i++) 
    {
            sum Of Natural Numbers += i;
        }
        int square Of Sum = sum Of Natural Numbers * sum Of Natural Numbers;

        int difference = square Of Sum - sum Of Squares;
        System.out.println("The difference between the sum of the squares and the square of the sum is: " + difference);
    }
}
