package unnathi.assignment.assignment8;

public class SpecialCharacterException extends Exception{
     public String getMessage(){
         return "Password should have at least one SpecialCharacter from $,! @,%,&";
     }
}
