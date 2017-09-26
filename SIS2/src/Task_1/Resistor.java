//package Task_1;
//
//import Task_1.Circuit;
//
//public class Resistor extends Circuit {
//    private double potentialDifference;
//    public Resistor(double resistance)
//    {
//        this.resistance = resistance;
//    }
//
//    public double getPotentialDifference() {
//        return potentialDifference;
//    }
//    public void setPotentialDifference(double potentialDifference) {
//        this.potentialDifference = potentialDifference;
//    }
//
//    @Override
//    public double getResistance() {
//        return this.resistance;
//    }
//
//    @Override
//    public double getPotentialDiff() {
//        return this.voltage;
//    }
//
//    @Override
//    public void applyPotentialDiff(double V) {
//     this.voltage = V;
//    }
//
//    @Override
//    public double getPower() {
//        return Math.pow(voltage, 2)/resistance;
//    }
//
//    @Override
//    public double getCurrent() {
//        return voltage/resistance;
//    }
//}
