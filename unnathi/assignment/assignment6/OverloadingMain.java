package unnathi.assignment.assignment6;
import java.util.*;
public class OverloadingMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        OverloadingDemo overloading1=new OverloadingDemo();
        String message=scanner.nextLine();
        OverloadingDemo overloading2=new OverloadingDemo(message);
    }
}
