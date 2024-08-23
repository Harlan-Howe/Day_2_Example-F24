import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PracticeClass
{
    private String myName;
    private Scanner keyReader;

    public PracticeClass() // constructor
    {
        System.out.println("Making a practice class.");
        keyReader = new Scanner(System.in);
    }

    public void greetUser()
    {
        System.out.println("What is your name? ");

        myName = keyReader.nextLine();

        System.out.println(STR."Hello, \{myName}!!!");
    }

    public void sayHello5Times()
    {
        int x = 0;
        while (x<5)
        {
            System.out.println(STR."Howdy, \{myName}.");
            x = x + 1;
        }
    }
}
