package assignment7.first;

public class Gerbil extends Rodents{
    public  Gerbil(){
        System.out.println("gerbil");
    }
    @Override
    public void move(){
        System.out.println("Gerbil is moving");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }
}
