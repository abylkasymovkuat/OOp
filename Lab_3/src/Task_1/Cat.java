package Task_1;

public class Cat extends  Animal {
    String sound;
    public  Cat(int numberOfLegs)
       {
           super(numberOfLegs);
       }
    public void roar()
    {
        System.out.print("Meow");
    }
    public void roar(String sound)
    {
        this.sound = sound;
    System.out.print(sound);
    }
}
