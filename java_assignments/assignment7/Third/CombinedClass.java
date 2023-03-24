package assignment7.Third;

public class CombinedClass extends ConcreteClass implements CombinedInterface{


    public CombinedClass(String name, int age) {
        super(name, age);
    }

    @Override
    public void methodCombined() {
        System.out.println("method combined");

    }

    @Override
    public void methodOneA() {
        System.out.println("methodOneA combined");
    }

    @Override
    public void methodOneB() {
        System.out.println("methodOneB combined");
    }

    @Override
    public void methodTwoA() {
        System.out.println("methodTwoA combined");
    }

    @Override
    public void methodTwoB() {
        System.out.println("methodTwoB combined");
    }

    @Override
    public void methodThreeA() {
        System.out.println("methodThreeA combined");
    }

    @Override
    public void methodThreeB() {
        System.out.println("methodThreeB combined");
    }
}
