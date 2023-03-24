package assignment7.Third;

public class AllMethods {
    public void methodA(Interface1 interfaceA) {
        interfaceA.methodOneB();
        interfaceA.methodOneA();

    }

    public void methodB(Interface2 interfaceB) {
        interfaceB.methodTwoA();
        interfaceB.methodTwoB();
    }

    public void methodC(Interface3 interfaceC) {
        interfaceC.methodThreeA();
        interfaceC.methodThreeB();
    }

    public void methodD(CombinedInterface interfaceD) {
        interfaceD.methodCombined();
    }
}
