package unnathi.assignment.assignment7.factories;

public class Tricycle implements Cycle{
    int wheels;
    Tricycle(){
        wheels=3;
    }
    public void ride(){
        System.out.println("Iam riding a Tricycle");
    }
    public void getWheelCount(){
        System.out.println(wheels);
    }
}
