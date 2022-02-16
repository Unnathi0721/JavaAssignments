package unnathi.assignment.assignment12;

import java.util.*;

public class StudentList {
    public List<Student> list=new ArrayList<Student>();
    public static void solveQueries(StudentList studentList){
        Streams stream = new Streams();
        stream.printDepartments(studentList.list);
        stream.getMaleStudentOfCSE(studentList.list);
        stream.getNames(studentList.list);
        stream.countMaleFemale(studentList.list);
        stream.averageAgeOfMaleFemale(studentList.list);
        stream.HighestPercentage(studentList.list);
        stream.countStudent(studentList.list);
        stream.averageOfDepartment(studentList.list);
        stream.getCount(studentList.list);
        stream.findYoungestStudent(studentList.list);
    }
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        //studentList.list.add();
        studentList.list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        solveQueries(studentList);
        //Streams
    }
}
