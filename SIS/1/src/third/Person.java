package third;

public class Person {
    private Gender gender;

    public Person( char c)
    {
        switch (c){
            case 'B':
                gender = Gender.B;
                break;
            case 'G':
                gender = Gender.G;
                break;


        }
    }
    public String toString()
    {
       return String.valueOf(gender);
    }
}