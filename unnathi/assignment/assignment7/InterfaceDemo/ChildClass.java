package unnathi.assignment.assignment7.InterfaceDemo;

public class ChildClass extends ParentClass implements SuperInterface{
     @Override
     public void run(){
         System.out.println("It's time to run") ;

     }
     @Override
     public void read(){
          System.out.println("Iam reading") ;
     }
     public void walk(){
          System.out.println("I'm taking Cleo for a walk");
     }
     public void listen(){
          System.out.println("Let's listen to some music");
     }
     public void write(){
          System.out.println("I'm writing");
     }
}
