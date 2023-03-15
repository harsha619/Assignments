package assignment7.second;

public class Main {

    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle : cycles) {
            cycle.ride();
        }

        for (Cycle cycle : cycles) {

//                cycle.balance();

        }


        Unicycle unicycle = (Unicycle) cycles[0];
        unicycle.ride();
        Tricycle tricycle=(Tricycle) cycles[2];


        Bicycle bicycle = (Bicycle) cycles[1];
        bicycle.balance();

    }
}
