package unnathi.assignment.assignment7.cycle.types;

public class Main {
    public static void main(String[] args){
        Cycle[] cycles=new Cycle[3];
        //UpCasting
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        /*for(int i=0;i<3;i++){
           cycles[i].balance();   //upcasting doesn't perform children's methods
        }
         */
        //DownCasting
        Unicycle unicycle=(Unicycle)(cycles[0]);
        Bicycle bicycle=(Bicycle)(cycles[1]);
        Tricycle tricycle=(Tricycle)(cycles[2]);
        unicycle.balance();
        bicycle.balance();
        tricycle.ride();
        //Unicycle unicycle=new Cycle();
        for(Cycle c:cycles){
            c.ride();
        }
    }
}
