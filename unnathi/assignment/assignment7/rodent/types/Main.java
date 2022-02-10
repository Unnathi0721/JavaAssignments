package unnathi.assignment.assignment7.rodent.types;

public class Main {
    public static void main(String[] args){
        Rodent Cleo=new Rat();
        Rodent Lara=new Hamster();
        Rodent Kenny=new Gerbil();
        Cleo.activeLevels(4);
        Lara.activeLevels(5);
        Kenny.activeLevels(3);
        System.out.println(Cleo.socialNature+" "+Lara.socialNature);
        Kenny.sounds();
        Lara.stay();
    }
}
