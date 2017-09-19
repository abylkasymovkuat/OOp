package Task_1;

public class Animal {
    private int numberOfLegs;
    public Animal(){};
    public Animal(int numberOfLegs)
    {
        this.numberOfLegs = numberOfLegs;
    }
    public void roar()
        {
         System.out.print("Make sound");
        }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
