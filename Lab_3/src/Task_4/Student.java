package Task_4;

public class Student extends Person{

    public Student (String name){
       super(name);
    }


    @Override
    public String getName() {
        return super.getName() + "is STUDENT ";
    }

    public static void printInformation(Person person)
    {
        System.out.print(person.getName());
    }
    public static void main(String args[])
    {
        Student student = new Student("Student ");
        Employee employee = new Employee("Employee ");
        Person person = student;
        System.out.print(person.getName());
        person = employee;
        System.out.print(person.getName());
        printInformation(employee);

    }
}
