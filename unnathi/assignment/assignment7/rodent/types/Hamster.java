package unnathi.assignment.assignment7.rodent.types;


public class Hamster extends Rodent {
    Hamster(){
        System.out.println("Iam a Hamster");
        super.socialNature=0;
    }
    @Override
    public void stay(){
        System.out.println("I live in glass aquarium or wire cages");
    }
    public void sounds(){
        System.out.println("I often squeak");
    }
}
