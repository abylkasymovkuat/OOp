package Task_1;

public class Maine {
    public static void main(String args[]){
    Cat cat = new Cat(3);
    cat.roar();
    System.out.print("\n");
    Animal animal = new Animal();
    animal.roar();
    System.out.println();
    cat.roar();
    System.out.print(cat.getNumberOfLegs());

}}
