package unnathi.assignment.assignment8;

public class CapitalLetterException extends Exception{
    public String getMessage(){
        return "Password's first letter should be Capital";
    }
}
