package assignment7.factory;

import assignment7.second.Cycle;
import assignment7.second.Unicycle;

public class UniCycleFactory implements   CycleFactory{
    @Override
    public Cycle name() {
        return new Unicycle();
    }
}
