package Task_3;

public class Employee extends Person
{
    protected double salary;
    protected int year;
    protected String insuranceNumber;

    public String getName()
    {
        return super.toString();
    }
    public Employee(double salary, int year, String insuranceNumber, String name)
        {
            super(name);
            this.insuranceNumber = insuranceNumber;
            this.year = year;
            this.salary = salary;
        }
    public String toString()
        {
            return String.format("Name is %s\nyear is %d\nsalary is %f\ninsurance number is %s\n", super.toString(), this.year, this.salary, this.insuranceNumber);
        }
    public boolean equals(Person employee1)
        {
            Employee employee = (Employee) employee1;
            return (this.salary == employee.getSalary() && this.year == employee.getYear() && super.equals(employee) && this.insuranceNumber.equals(employee.getInsuranceNumber()))? true : false;
        }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
}
