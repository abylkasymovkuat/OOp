package Task_3;

import java.util.Vector;

public class Manager extends Employee
    {
        private  Vector <Employee> employees;
        public Manager(double salary, int year, String insuranceNumber, String name) {
            super(salary, year, insuranceNumber, name);
            employees = new Vector<Employee>();
        }

        public void setSalary(double bonus)
        {
            this.salary = salary;
        }
        public void getBonus(double bonus)
        {
            setSalary(bonus + salary);
        }

        public boolean equals(Person manager) {
            Manager manager1 = (Manager)manager;
            return (super.equals(manager1) && this.employees.equals(manager1.getEmployees()))?true:false;
        }
        public String toString(){
            String empl = "";
            for ( int i =0; i <employees.size(); i++)
            {
                empl += i + "-th element is "+ employees.get(i).getName()+"\n";
            }
            return super.toString() + empl;
        }
        public void addEmployee(Employee employee)
        {
            employees.add(employee);
        }

        public Vector<Employee> getEmployees() {
            return employees;
        }
    }
