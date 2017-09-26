package Task_1;

import Task_1.Circuit;

public class Parallel extends Circuit {
    @Override
    public double getResistance() {
        return 0;
    }

    @Override
    public double getPower() {
        return 0;
    }

    @Override
    public double getCurrent() {
        return 0;
    }

    @Override
    public double getPotentialDiff() {
        return 0;
    }

    @Override
    public void applyPotentialDiff(double V) {

    }
}
