package unnathi.assignment.assignment5;

public class Data {
    int n;
    char c;
    public void method1(){
        int nm=1;//int nm;as the local variables are not initialised the value is null
        char ch='a'; //char ch;      but if the variables or static or instance variables they have their respective primitive datatype default values
        System.out.println(nm+" "+ch);
    }
    public void method2(){
        System.out.println(n+" "+c);
    }
}
