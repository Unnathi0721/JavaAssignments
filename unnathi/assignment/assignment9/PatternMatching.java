package unnathi.assignment.assignment9;
import java.util.*;
//import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the input : ");
        String input=scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z].*[.]$");
        Matcher matcher = pattern.matcher(input);
        boolean checkValue=matcher.matches();
        System.out.println(checkValue);
    }
}
