package unnathi.assignment.assignment7.rodent.types;


public class Rat extends Rodent {
    Rat(){
        System.out.println("Iam a Rat");
        super.socialNature=2;
    }
    @Override
    public void stay() {
        System.out.println("I live in wire Cage");
    }
    public void sounds(){
        System.out.println("I will make sounds like squeaking,hissing and chattering");
    }
}
