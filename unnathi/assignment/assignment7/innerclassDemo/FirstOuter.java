package unnathi.assignment.assignment7.innerclassDemo;

public class FirstOuter {
    public class FirstInnerOne{
          FirstInnerOne(String msg){
              System.out.println("Iam FirstInnerOne and msg is :"+msg);
          }
    }
    public static class FirstInnerTwo{
        int i=1;
          FirstInnerTwo(){
              System.out.println("Iam FirstInnerTwo ");
          }
    }
}
