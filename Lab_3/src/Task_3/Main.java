package Task_3;

public class Main
    {
        public static void main(String args[])
        {
            Manager manager = new Manager(10000, 2006, "16BD02105", "KUAT");
            manager.addEmployee(new Employee(10000, 2006, "16BD02105", "FirstEmploye"));
            manager.addEmployee(new Employee(10000, 2006, "16BD02105", "SecondEmployee"));
            System.out.print(manager);
        }
    }
