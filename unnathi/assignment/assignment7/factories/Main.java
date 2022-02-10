package unnathi.assignment.assignment7.factories;

public class Main {
    public static void main(String[] args){
        UnicycleFactory factory1=new  UnicycleFactory();
        BicycleFactory factory2=new  BicycleFactory();
        TricycleFactory factory3=new  TricycleFactory();
        Cycle cycle1=factory1.select();
        Cycle cycle2=factory2.select();
        Cycle cycle3=factory3.select();
        cycle1.ride();
        cycle2.getWheelCount();
        cycle3.getWheelCount();
    }
}
