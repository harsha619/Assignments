package assignment7.first;

public class Mouse extends  Rodents{
    public Mouse(){
        System.out.println("mouse");
    }
    @Override
    public void move(){
        System.out.println("mouse is moving");
    }

    @Override
    public void eat() {
        System.out.println("mouse is eating");
    }
}
