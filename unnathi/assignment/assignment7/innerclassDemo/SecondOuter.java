package unnathi.assignment.assignment7.innerclassDemo;

public class SecondOuter{
    public class SecondInnerOne extends FirstOuter.FirstInnerOne{
          SecondInnerOne(String msg){
              new FirstOuter().super(msg);
              System.out.println("Iam SecondInnerOne "+msg);
          }
    }
    public class SecondInnerTwo extends FirstOuter.FirstInnerTwo{
          SecondInnerTwo(){
              System.out.println("Iam SecondInnerTwo");
          }
    }
}
