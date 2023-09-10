//imports
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Scanner;




public class PersonReader
{
    public static void main(String[] args)
    {
        //Declarations
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";
        Scanner con = new Scanner(System.in);
        boolean start = true;
        ArrayList<Person> people = new ArrayList<>();
        Person folk;

        start = SafeInput.getYNConfirm(con, "Would you like to select a file?");


        if (start)
        {

            try{
                File workingDirectory = new File(System.getProperty("user.dir"));
                chooser.setCurrentDirectory(workingDirectory);

                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    selectedFile = chooser.getSelectedFile();
                    Path file = selectedFile.toPath();


                    InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                    while (reader.ready())
                    {
                        rec = reader.readLine();

                        //separates files into  fields
                        String [] details = rec.split(", ");

                        //assignments of fields
                        String ID = details[0];
                        String firstName = details[1];
                        String lastName = details[2];
                        String title = details[3];
                        String strYOB = details[4];

                        int YOB = Integer.parseInt(strYOB);

                       folk = new Person(ID, firstName, lastName, title, YOB);

                        folk.setFirstName(firstName);

                        //records in array list
                        people.add(folk);

                        System.out.println(folk);



                    }

                    System.out.println();
                    System.out.println(String.format("%-8s%-12s%-12s%-5s%5s", "ID#", "Firstname", "Lastname", "Title", "YOB"));
                    System.out.println("==================================================");



                    for(Person p: people)
                    {
                        System.out.println(String.format("%-8s%-12s%-12s%-5s%6s",p.getID(), p.getFirstName(), p.getLastName(), p.getTitle(), p.getYOB()));

                    }


                }

                else
                {
                    System.out.println("You must choose a file. Program terminating.");
                    System.exit(0);
                }
            } catch (FileNotFoundException e)
            {
                System.out.println("File not found.");
                e.printStackTrace();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }

        else if (!start)
        {
            start = false;
            System.out.println("You did not want to select a file. Goodbye.");
            System.exit(0);
        }
    }


}


