package Task_4;

public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName() + "is EMPLOYEE ";
    }
}
