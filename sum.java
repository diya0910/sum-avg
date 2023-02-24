import java.util.Scanner;

class Main {
  public static void main(final String[] args) {
    System.out.println("Hello world!");

    //calculating the  Product of odd Integers
    int product = 1;
    for (int i = 0; i <= 15; i++) {
      if (i % 2 != 0) {
        product = product * i;
      } else {
        continue;
      }
    }
    System.out.println("The product of all odd integers from 1 to 15 is " + product);

    // Factorials
    long factorial = 1;
    for (int i = 1; i <= 20; i++) {
      factorial = factorial * i;
    }
    System.out.println("The factorial of 20 is " + factorial);

    // Sum and Average
    Scanner read = new Scanner(System.in);
    System.out.println("Enter first number :");
    int Num1 = read.nextInt();
    System.out.println("Enter Second number :");
    int Num2 = read.nextInt();
    System.out.println("Enter Third number :");
    int Num3 = read.nextInt();
    System.out.println("Enter forth number :");
    int Num4 = read.nextInt();
    System.out.println("Enter fifth number :");
    int Num5 = read.nextInt();
    System.out.println("Enter sixth number :");
    int Num6 = read.nextInt();
    System.out.println("Enter seventh number :");
    int Num7 = read.nextInt();
    System.out.println("Enter eighth number :");
    int Num8 = read.nextInt();
    System.out.println("Enter ninth number :");
    int Num9 = read.nextInt();
    System.out.println("Enter tenth number :");
    int Num10 = read.nextInt();

    long Sum = Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7 + Num8 + Num9 + Num10;
    
    float Average = Sum / 10;
    
    System.out.println("Sum of Entered number: " + Sum); 
    System.out.println("Average of Entered number:" + Average);

  }
}



