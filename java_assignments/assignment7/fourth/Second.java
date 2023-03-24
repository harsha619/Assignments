package assignment7.fourth;



public class Second extends First {

    public Second(String name) {
        super(name);
    }

    public final class  SecondInner extends First.FirstInner{
        public  SecondInner(String name){
            super(name);
            System.out.println("second inner"+name);
        }
     }
}
