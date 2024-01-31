import java.util.Scanner;
import static java.lang.Character.*;

public class WordCounter
{
    public static void main(String arg[])
    {
        System.out.println("Enter the text:");
        Scanner s = new Scanner(System.in);

        //Reading input from the user...

        String str = s.nextLine();

        //Splitting the string by " " and storing it in string array...

        String[] arr = str.split(" ");

        //Eliminating whitespaces in between by using replace() method...

        String str1 = str.replace(" ","");

        //Evaluating computed string length to find the frequency of characters as we removed whitespaces...

        System.out.println("\n\nWord Counter");
        System.out.println("-----------------------------");
        System.out.println("Number of words : "+arr.length);
        System.out.println("Total frequency: "+str1.length());
        int count[] = new int[256];
        for(int i=0;i<256;i++)
        {
            count[i] = 0 ;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(isLetter(str1.charAt(i))) //This excludes whitespace count ascii "32".
            {
                count[str1.charAt(i)]++; //Incrementing for each letter existence at their specific array index.
            }
        }
        for(int i=0;i<256;i++) //Iterating in ascending for alphabetical order.
        {
            if(count[i]>0)
            {
                //Character.toString() method converts an value(ascii) to its corresponding character.
                System.out.println(Character.toString((char)i)+": "+count[i]);
            }
        }
        System.out.println("-----------------------------");
    }
}
