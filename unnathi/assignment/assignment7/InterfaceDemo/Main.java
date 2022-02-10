package unnathi.assignment.assignment7.InterfaceDemo;

public class Main {
    public static void main(String[] args){
        SuperInterface superAssistance=new ChildClass();
        superAssistance.read();
        superAssistance.sing();
        superAssistance.run();
        superAssistance.walk();
    }
}
