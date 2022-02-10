package unnathi.assignment.assignment8;

public class SpecialCharacterException extends Exception{
    SpecialCharacterException(){
         System.out.println("Password should have at least one SpecialCharacter from $,! @,%,&");
     }
}
