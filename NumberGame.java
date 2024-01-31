import java.util.Scanner;
public class NumberGame
{
    public static void main(String arg[])
    {
        int number = 89;
        System.out.println("Welcome To Number Game!\n");
        System.out.println("You have 3 choices to guess the correct number\n");
        int count = 3 ;
        while(count>0)
        {
            System.out.println("Enter a number between 1 and 100:");
            Scanner s = new Scanner(System.in);
            int guessnum = s.nextInt();
            if(guessnum < number)
            {
                System.out.println("Your guess is small");
                int res1 = count-1;
                System.out.println("You have "+res1+" chance left\n");
            }
            else if(guessnum > number)
            {
                System.out.println("Your guess is high");
                int res2 = count-1;
                System.out.println("You have "+res2+" chance left\n");
            }
            else if(guessnum == number && count==3)
            {
                System.out.println("Bravo!You've found the number in first attempt.");
                System.out.println("The Luck of the Draw.\n");
                break;
            }
            else if(guessnum == number && count==2)
            {
                System.out.println("Bravo!You've found the number in second attempt.");
                System.out.println("Cool.\n");
                break;
            }
            else if(guessnum == number && count==1)
            {
                System.out.println("Bravo!You've found the number in last attempt.");
                System.out.println("Not Bad.\n");
                break;
            }
            count--;
            if(count == 0)
            {
                System.out.println("You failed to guess the correct number.\n");
                System.out.println("The guess number is "+number+"!\n");
                System.out.println("Better luck next time!\n");
            }
        }
    }
}
