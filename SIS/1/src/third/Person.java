package third;

public class Person {
    private Gender gender;

    public Person( char c)
    {
        switch (c){
            case 'B':
                gender = Gender.Boy;
                break;
            case 'G':
                gender = Gender.Girl;
                break;


        }
    }
    public Character toChar()
    {
       return this.gender.asChar();
    }
}