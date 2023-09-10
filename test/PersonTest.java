import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //declarations for Person
    Person example;

    @BeforeEach
    void setUp()
    {
        example = new Person("000001", "Bilbo", "Baggins", "Esq.", 1060);
    }

    @Test
    void setID()
    {
        example.setID("000001");
        assertEquals("000001",example.getID());
    }

    @Test
    void setFirstName()
    {
        example.setFirstName("Bilbo");
        assertEquals("Bilbo",example.getFirstName());
    }

    @Test
    void setLastName()
    {
        example.setID("Baggins");
        assertEquals("Baggins",example.getLastName());
    }

    @Test
    void setTitle()
    {
        example.setTitle("Esq.");
        assertEquals("Esq.",example.getTitle());
    }

    @Test
    void setYOB()
    {
        example.setYOB(1060);
        assertEquals(1060, example.getYOB());
    }

    @Test
    void testToString()
    {
        example = new Person ("000001", "Bilbo", "Baggins", "Esq.", 1060);
        assertEquals("Person{" +
                "ID='" + "000001" + '\'' +
                ", firstName='" + "Bilbo" + '\'' +
                ", lastName='" + "Baggins" + '\'' +
                ", title='" + "Esq." + '\'' +
                ", YOB=" + "1060" +
                '}', example.toString());

    }

    @Test
    void fullName()
    {
        example = new Person ("000001", "Bilbo", "Baggins", "Esq.", 1060);

        assertEquals("Bilbo"+" "+ "Baggins",example.fullName());
    }

    @Test
    void formalName()
    {
        example = new Person ("000001", "Bilbo", "Baggins", "Esq.", 1060);

        assertEquals("Esq."+" "+"Bilbo"+" "+ "Baggins",example.formalName());

    }

    @Test
    void getAge()
    {
        example.setYOB(1060);
        assertEquals("963", example.getAge());
    }

    @Test
    void toCSVDataRecord()
    {
        example = new Person ("000001", "Bilbo", "Baggins", "Esq.", 1060);
        assertEquals("000001"+ ", "+ "Bilbo"+ ", "+ "Baggins"+ ", "+ "Esq."+ ", "+ 1060, example.toCSVDataRecord());

    }
}