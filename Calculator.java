import java.util.Scanner;
public class Calculator{
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner sc = new Scanner(System.in);
      System.out.println("Options");
      System.out.println("+");
      System.out.println("- ");
      System.out.println("*");
      System.out.println("/");
      System.out.println("\nEnter an operator (+, -, *, /): ");
      op = sc.next().charAt(0);
      
      System.out.println("Enter two numbers: ");
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
    
      switch(op) {
         case '+':
            ans = num1 + num2;
            break;
         case '-': 
            ans = num1 - num2;
            break;
         case '*':
            ans = num1 * num2;
            break;
         case '/': 
            ans = num1 / num2;
            break;
        default: 
          System.out.printf("Error! Enter correct operator");
          return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
    