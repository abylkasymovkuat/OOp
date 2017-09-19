package Task_3;

public class Person {

    protected String name;
    public Person(){}
    public Person(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
    public boolean equals(Person person)
    {
        return (this.name.equals(person.name)) ? true : false;
    }

}
