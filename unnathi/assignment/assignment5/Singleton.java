package unnathi.assignment.assignment5;

public class Singleton {
    String st;
    public static Singleton fun(String s){
        //st=s;    Explanation - a static function can't access non-static  members and methods
        return new Singleton();
    }
    public void fun2(String s){
        this.st=s;
    }
    public void getString(){
        System.out.println(st);
    }
}
