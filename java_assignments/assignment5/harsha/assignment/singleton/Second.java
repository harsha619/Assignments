package assignment5.harsha.assignment.singleton;

public class Second {
    public  String name;
    public  static Second stringMethod(String firstName){

        Second object= new Second();
        object.name="ram";
        return object;

    }
    public  void  printString(){
        System.out.println(name);
    }

}
