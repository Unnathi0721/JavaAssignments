package unnathi.assignment.assignment8;
import java.util.*;
public class ErrorHandling {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Enter Username : ");
            String userName=scanner.nextLine();
            System.out.print("Enter Password : ");
            String password=scanner.next();
            if(password.length()<8){
                throw new LengthException();
            }
            if(Character.isLowerCase(password.charAt(0))){
                throw new CapitalLetterException();
            }
            if(!(password.contains("$") || password.contains("@") || password.contains("!") || password.contains("%") || password.contains("&"))){
                throw new SpecialCharacterException();
            }
        }
        catch(Exception exception){
            System.out.println("Exception caught");
            exception.getMessage();
        }
        finally{
            System.out.println("Processing Details ...");
        }
    }
}
