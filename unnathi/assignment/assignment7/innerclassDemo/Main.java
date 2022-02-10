package unnathi.assignment.assignment7.innerclassDemo;

public class Main {
    public static void main(String[] args){
        FirstOuter outerOne=new FirstOuter();
        FirstOuter.FirstInnerOne firstInnerOne=outerOne.new FirstInnerOne("Hi");
        FirstOuter.FirstInnerTwo firstInnerTwo=new FirstOuter.FirstInnerTwo();
        System.out.println(firstInnerTwo.i);
        SecondOuter outerTwo=new SecondOuter();
        SecondOuter.SecondInnerOne secondInnerOne=outerTwo.new SecondInnerOne("Hi");
        SecondOuter.SecondInnerTwo secondInnerTwo=outerTwo.new SecondInnerTwo();
    }
}
