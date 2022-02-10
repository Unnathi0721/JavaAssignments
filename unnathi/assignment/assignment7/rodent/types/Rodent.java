package unnathi.assignment.assignment7.rodent.types;

abstract class Rodent {
    int socialNature=-1;
    int activityScore=0;
    abstract public void stay();
    public void sounds(){
        System.out.println("Squeak Squeak");
    }
    public void activeLevels(int l){
        activityScore=l;
    }
}
