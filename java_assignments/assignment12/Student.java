package assignment12;

public class Student {
    public int id,age,year;
    public String name, gender,engDepartment;
    public double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int year, Double perTillDate){
        this.id=id;
        this.age=age;
        this.year=year;
        this.name=name;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.perTillDate=perTillDate;
    }

    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public  double getPercentage() {
        return perTillDate;
    }

    public String  getDepartment() {
        return engDepartment;
    }
}
