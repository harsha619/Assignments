package assignment7.first;

public class Hamster extends  Rodents{
    public  Hamster(){
        System.out.println("hamster");
    }
    @Override
    public void move(){
        System.out.println("hamster is moving");
    }

    @Override
    public void eat() {
        System.out.println("hamster is eating");
    }
}
