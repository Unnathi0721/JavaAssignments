package unnathi.assignment.assignment6;

public class OverloadingDemo {
    String string;
    OverloadingDemo(){
        this("Hi");
        System.out.println("OverloadingDemo class no argument constructor");
    }
    OverloadingDemo(String msg){
        System.out.println(msg);
    }
}
