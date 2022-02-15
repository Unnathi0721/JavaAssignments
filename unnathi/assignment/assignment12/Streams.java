package unnathi.assignment.assignment12;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
public class Streams {
        public void printDepartments(List<Student> slist) {
            slist.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
        }
        public void getMaleStudentOfCSE(List<Student> slist) {
            slist.stream().filter(student->student.getEngDepartment().equals("Computer Science") && student.gender.equals("Male")).forEach(s -> System.out.println(s.name));
        }

        public void getNames(List<Student> slist) {
            slist.stream().filter(student -> student.yearEnrollment>2018).map(Student::getName).collect(Collectors.toList()).forEach(System.out::println);
        }
        public void countMaleFemale(List<Student> slist) {
            slist.stream().collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("Number of "+k+" student : "+v.size()));
        }

        public void averageAgeOfMaleFemale(List<Student> slist) {
            slist.stream().collect(groupingBy(Student::getGender,averagingInt(Student::getAge))).forEach((k,v)-> System.out.println("Average age of "+k+" is "+v));
        }

        public void HighestPercentage(List<Student> slist) {
            Student studentPercentage=slist.stream().min(Comparator.comparing(Student::getPerTillDate)).orElseThrow(NoSuchElementException::new);
            System.out.println(studentPercentage.perTillDate);
        }

        public void countStudent(List<Student> slist) {
            slist.stream().collect(groupingBy(Student::getEngDepartment)).forEach((k,v)-> System.out.println(k+"Department has "+v.size()+" Students."));
        }

        public void averageOfDepartment(List<Student> slist) {
            slist.stream().collect(groupingBy(Student::getEngDepartment,averagingDouble(Student::getPerTillDate))).forEach((k,v)-> System.out.println(k+" Department has average percentage "+v));

        }

        public void findYoungestStudent(List<Student> slist) {
            //Comparator.comparingInt(Student::getAge)
            Student youngestStudent=slist.stream().filter(student->student.engDepartment.equals("Electronic") && student.gender.equals("Male")).min(Comparator.comparingInt(Student::getAge)).orElseThrow(NoSuchElementException::new);
            System.out.println(youngestStudent.id+" "+youngestStudent.name+" "+youngestStudent.gender+" "+youngestStudent.engDepartment);
        }

        public void getCount(List<Student> slist) {
            slist.stream().filter(student->student.engDepartment.equals("Computer Science")).collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("No of "+k+" Students: "+v.size()));

        }
}
