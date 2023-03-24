package assignment7.factory;

import assignment7.second.Cycle;
import assignment7.second.Tricycle;

public class TriCycleFactory implements CycleFactory{
    @Override
    public Cycle name() {
        return new Tricycle();
    }
}
