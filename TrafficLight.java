import java.util.Scanner;
class InsufficientBalanceException extends Exception{
 InsufficientBalanceException(String msg){super(msg);}
}
public class BankWithdrawal{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double balance=5000, amount=sc.nextDouble();
  try{
   if(amount>balance) throw new InsufficientBalanceException("Insufficient Balance");
   System.out.println("Remaining Balance = "+(balance-amount));
  }catch(Exception e){System.out.println(e.getMessage());}
  sc.close();
 }
}