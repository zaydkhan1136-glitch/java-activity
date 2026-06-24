import java.util.Scanner;
public class DivisionByZero {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Dividend: ");
  int a=sc.nextInt();
  System.out.print("Enter Divisor: ");
  int b=sc.nextInt();
  try{ System.out.println("Result = "+(a/b)); }
  catch(ArithmeticException e){ System.out.println("Cannot divide by zero."); }
  sc.close();
 }
}