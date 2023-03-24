package assignment7.Third;

public class Main {
    public static void main(String[] args) {
       AllMethods object=new AllMethods();
       ConcreteClass combinedClass= new CombinedClass("ram",10);
        object.methodA((Interface1) combinedClass);
        object.methodB((Interface2) combinedClass);
        object.methodC((Interface3) combinedClass);
        object.methodD((CombinedInterface) combinedClass);
    }
}
