package unnathi.assignment.assignment12;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearEnrollment ;
    double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int yearEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearEnrollment=yearEnrollment;
        this.perTillDate=perTillDate;
    }
    public int getAge(){
        return this.age;
    }
    public int getYearEnrollment(){
        return this.yearEnrollment;
    }
    public int getId(){
        return this.id;
    }
    public String getGender(){
        return this.gender;
    }
    public String getEngDepartment(){
        return this.engDepartment;
    }
    public double getPerTillDate(){
        return this.perTillDate;
    }
    public String getName(){
        return this.name;
    }
}
