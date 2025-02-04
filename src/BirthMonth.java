import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
           System.out.print("Enter your birth month [1-12]: ");
           birthMonth = in.nextInt();
           if(birthMonth <= 12 & birthMonth >= 1)
           {
               System.out.println("You said your birth month is " + birthMonth + ".");
           }
           else
           {
               System.out.println("Your input of " + birthMonth + " was not valid. Please enter a number from 1-12.");
           }

    }
}