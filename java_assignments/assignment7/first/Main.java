package assignment7.first;

public class Main {
    public static void main(String[] args) {
        Rodents[] rodents= new Rodents[3];
        rodents[0]=new Mouse();
        rodents[1]= new Gerbil();
        rodents[2]= new Hamster();
        for (Rodents rodent:rodents){
            rodent.move();
        }
    }
}
