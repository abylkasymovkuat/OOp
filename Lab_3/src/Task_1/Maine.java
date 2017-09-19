package Task_1;

public class Maine {
    public static void main(String args[]){
    Cat cat = new Cat(3);
    cat.roar();
    System.out.print("\n");
    Animal animal = new Animal();
    animal.roar();
    System.out.println();
    System.out.print(cat.roar("Qua-qua "));
    System.out.print(cat.getNumberOfLegs());

}}
