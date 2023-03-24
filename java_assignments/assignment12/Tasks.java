package assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public Student[] arrayList;
    public  Tasks(Student[] arrayList){
        this.arrayList=arrayList;
    }
    public  void printAllDepartments(){
        Set<String> departments= Arrays.stream(arrayList).map(item->item.engDepartment).collect(Collectors.toSet());
        System.out.println(departments);
    }
    public  void studentsAfter2018(){
        List<String> students= Arrays.stream(arrayList).filter(item->item.year>2018).map(item->item.name).collect(Collectors.toList());
        System.out.println(students);
    }
    public  void maleComputerStudents(){
        List<String> maleStudents=Arrays.stream(arrayList).filter(item-> item.gender=="Male" && item.engDepartment=="Computer Science").map(item->item.name).collect(Collectors.toList());
        System.out.println(maleStudents);
    }
    public  void noMaleAndFemale(){
        Map<String, Long> countByGender = Arrays.stream(arrayList)

                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("male "+countByGender.get("Male"));
        System.out.println("female "+countByGender.get("Female"));
    }
    public  void avgAge(){
        double avgAgeMale = Arrays.stream(arrayList)
                .filter(s -> s.getGender().equals("Male"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(Double.NaN);
        double avgAgeFemale = Arrays.stream(arrayList)
                .filter(s -> s.getGender().equals("Female"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(Double.NaN);
        System.out.println("male avg:"+ avgAgeMale);
        System.out.println("female avg:"+ avgAgeFemale);

    }
    public  void highestPercentage(){
        Student highestStudent=
        Arrays.stream(arrayList)
                .max(Comparator.comparingDouble(Student::getPercentage))
                .orElse(null);
        if(highestStudent!=null)
            printData(highestStudent);
    }
    public  void noOfStudentEachDept(){
        Map<String, Long> list =Arrays.stream(arrayList).collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        System.out.println(list);
    }
    public  void avgPercentage(){
        Map<String, Double> list =Arrays.stream(arrayList).collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getPercentage)));
        System.out.println(list);

    }
    public void youngestMaleStudent(){
        Optional<Student> list =Arrays.stream(arrayList).filter(item-> Objects.equals(item.engDepartment, "Electrical") && item.gender.equals("Male")).min(Comparator.comparingInt(Student::getAge));
        System.out.println("youngest male student in Electrical");
        printData(list.get());
    }
    public  void maleAndFemaleCse(){
        Map<String, Long> count = Arrays.stream(arrayList).filter(item->item.engDepartment=="Computer Science").collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(count);
    }
    public void printData(Student student){
        System.out.println("Details of the student with highest percentage: ");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.gender);
        System.out.println("dept: " + student.engDepartment);
        System.out.println("year: " + student.year);
        System.out.println("percentage: " + student.perTillDate);
    }


}
