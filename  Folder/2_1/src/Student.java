public class Student {
    private String name;
    private String id;
    private int yearOfStudy = 2016;
    public Student( String name, String id)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void changeYear()
    {
        yearOfStudy++;
    }
    public String getName() {
        return name;
    }
}
