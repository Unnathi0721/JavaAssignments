package unnathi.assignment.assignment7.factories;

public class Bicycle implements Cycle{
    int wheels;
    Bicycle(){
        wheels=2;
    }
    public void ride(){
        System.out.println("Iam riding a Bicycle");
    }
    public void getWheelCount(){
        System.out.println(wheels);
    }
}
