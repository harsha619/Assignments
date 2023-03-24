package assignment5.harsha.assignment.main;

import assignment5.harsha.assignment.data.First;
import assignment5.harsha.assignment.singleton.Second;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        first.localVariables();
        first.printVariables();
        Second second= new Second();
        second.stringMethod("ram");
        second.printString();
    }
}
