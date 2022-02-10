package unnathi.assignment.assignment7.rodent.types;


public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("Iam a Gerbil");
        super.socialNature=1;
    }
    @Override
    public void stay(){
        System.out.println("I live in glass or plastic aquarium");
    }
    public void sounds(){
       System.out.println("I do all kinds of noises from squeaking to chirping");
    }
}
