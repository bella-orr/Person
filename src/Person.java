public class Person
{
  private String ID = "";
  private String firstName = "";
  private String lastName = "";
  private String title = "";
  private int YOB = 0;

    public Person(String ID, String firstName, String lastName, String title, int YOB)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }
// getters and setters
    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYOB()
    {
        return YOB;
    }

    public void setYOB(int YOB)
    {
        this.YOB = YOB;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    public String getAge()
    {
        int age = 2023-YOB;
        String strAge = String.valueOf(age);
        return strAge;

    }


    public String toCSVDataRecord()
        {
            return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
        }


}