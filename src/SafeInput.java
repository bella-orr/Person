import java.util.Scanner;

//Part A, getNonZeroLenString
public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);
        return retString;
    }

//Part B, getInt

    public static int getInt(Scanner pipe, String prompt)
    {
        //Declarations
        Scanner in = new Scanner(System.in);
        int retInt = 0;
        String trash;
        boolean finished = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (in.hasNextInt()) //if input is an int
            {
                retInt = in.nextInt();
                finished = true;
            }

            else //if input is not an int
            {
                System.out.println("You entered and invalid input, please try again");
                trash = in.nextLine();
            }

        }
        while(!finished);
        return retInt;
    }

//Part C, getDouble

    public static double getDouble(Scanner pipe, String prompt)
    {
        //Declarations
        Scanner in = new Scanner(System.in);
        double retDouble = 0;
        String trash;
        boolean finished = false;

        do
        {
            System.out.print("\n" + prompt + ": "); //prompts user

            if (in.hasNextDouble()) //if input is a double
            {
                retDouble = in.nextDouble();
                finished = true;
            }

            else //if input is not a double
            {
                System.out.println("You entered and invalid input, please try again");
                trash = in.nextLine();
            }

        }
        while(!finished);
        return retDouble;
    }

    //Part D, getRangeInt

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        //Declarations
        Scanner in = new Scanner(System.in);
        int rangedInt = 0;
        String trash;
        boolean finished = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (in.hasNextInt()) //if input is an int
            {
                rangedInt = in.nextInt();
                if (rangedInt < low || rangedInt > high)// tests to see if input is in range
                {
                    System.out.println("You entered and invalid input, please try again");
                }
                else
                {
                    finished = true;
                }

            }

            else //if input is not an int
            {
                System.out.println("You entered and invalid input, please try again");
                trash = in.nextLine();
            }

        }
        while(!finished);
        return rangedInt;
    }

    //Part E, getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        //Declarations
        Scanner in = new Scanner(System.in);
        double ranDouble = 0;
        String trash;
        boolean finished = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (in.hasNextDouble()) //if input is a double
            {
                ranDouble = in.nextDouble();
                if (ranDouble < low || ranDouble > high)// tests to see if input is in range
                {
                    System.out.println("\nYou entered and invalid input, please try again");
                }
                else
                {
                    finished = true;
                }

            }

            else //if input is not a double
            {
                System.out.println("\nYou entered and invalid input, please try again");
                trash = in.nextLine();
            }

        }
        while(!finished);
        return ranDouble;
    }

    //Part F, getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        //Declarations
        String option = "";
        boolean metBoolean = false;
        boolean classBoolean = true;

        do
        {
            System.out.print("\n" + prompt + ": "); // prompt for user
            option = pipe.nextLine();

            if (option.equalsIgnoreCase("y")||option.equalsIgnoreCase("yes") || option.equalsIgnoreCase("n") || option.equalsIgnoreCase("no"))
            {
                if  (option.equalsIgnoreCase("y")||option.equalsIgnoreCase("yes")) //if user has more items
                {
                    classBoolean = !classBoolean;
                    metBoolean = !metBoolean;
                }

                else // if user has no more items
                {
                    classBoolean = true;
                    metBoolean = !metBoolean;
                }

            }

            else // user enters invalid input
            {
                System.out.print("\nYou entered an invalid input, please try again\n");
                metBoolean = false;
            }
        }while(!metBoolean);
        return classBoolean;

    }

// Part G, getRegExString

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        //Declarations
        String value = "";
        boolean gotAValue = false;

        do
        {
            // show the prompt
            System.out.print(prompt + ": ");

            // input the data
            value = pipe.nextLine();

            // test to see if it is correct
            if(value.matches(regExPattern))
            {
                // We have a match this String passes!
                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }


        }while(!gotAValue);
        return value;

    }

}