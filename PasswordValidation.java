import java.util.Scanner;
class InvalidPasswordException extends Exception{
 InvalidPasswordException(String msg){super(msg);}
}
public class PasswordValidation{
 static void validate(String p) throws InvalidPasswordException{
  if(p.length()<6) throw new InvalidPasswordException("Password too short");
  boolean d=false; for(char c:p.toCharArray()) if(Character.isDigit(c)) d=true;
  if(!d) throw new InvalidPasswordException("Password must contain a digit");
  System.out.println("Valid Password");
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  try{validate(sc.nextLine());}catch(Exception e){System.out.println(e.getMessage());}
  sc.close();
 }
}