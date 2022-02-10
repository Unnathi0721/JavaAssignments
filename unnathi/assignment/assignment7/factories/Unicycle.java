package unnathi.assignment.assignment7.factories;

public class Unicycle implements Cycle{
        int wheels;
        Unicycle(){
             wheels=1;
        }
        public void ride(){
             System.out.println("Iam riding a Unicycle");
        }
        public void getWheelCount(){
        System.out.println(wheels);
        }
}
