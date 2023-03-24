package assignment7.factory;

import assignment7.second.Bicycle;
import assignment7.second.Cycle;

public class BiCycleFactory implements  CycleFactory{
    @Override
    public Cycle name() {
        return new Bicycle();
    }
}
