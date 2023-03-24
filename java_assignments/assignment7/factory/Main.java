package assignment7.factory;

import assignment7.second.Cycle;

public class Main {
    public static void main(String[] args) {
        CycleFactory uniCycleFactory= new UniCycleFactory();
        CycleFactory biCycleFactory= new BiCycleFactory();
        CycleFactory triCycleFactory= new TriCycleFactory();

        Cycle uniCycle= uniCycleFactory.name();
        Cycle biCycle= biCycleFactory.name();
        Cycle triCycle= triCycleFactory.name();
    }
}
