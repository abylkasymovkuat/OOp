package fifth;
public class InWord{

    String [] a = {"", "one", "two", "three", "four", "five", "six", "seven", "eight",
    "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
    "seventeen", "eighteen","nineteen"};
    String [] b = {"","ten", "twenty" , "thirty", "fourty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};

    public String inWords (int number)
    {
        if ( number == 0)
            {
                return "zero";
            }
        if (number < 10)
            {
                return a[number];
            }
         else if ( number <100)
                {
                    return b[number/10] + b[number%10];
                }
            return "hehe";
    }
    public static void main (String args[])
    {
        InWord inWord = new InWord();
        System.out.print(inWord.inWords(3));
    }

}
