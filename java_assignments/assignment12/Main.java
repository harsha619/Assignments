package assignment12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student[] array = new Student[17];
        array[0] = new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        array[1] = new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        array[2] = new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        array[3] = new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80.0);
        array[4] = new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0);
        array[5] = new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0);
        array[6] = new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0);
        array[7] = new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0);
        array[8] = new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0);
        array[9] = new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0);
        array[10] = new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0);
        array[11] = new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        array[12] = new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        array[13] = new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        array[14] = new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        array[15] = new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        array[16] = new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

        Set<Student> list = Arrays.stream(array).collect(Collectors.toSet());
        Tasks tasks= new Tasks(array);
//        tasks.printAllDepartments();
//        tasks.studentsAfter2018();
//        tasks.noMaleAndFemale();
//            tasks.noOfStudentEachDept();
//            tasks.avgPercentage();
//        tasks.youngestMaleStudent();
//        tasks.maleAndFemaleCse();
    }
}
