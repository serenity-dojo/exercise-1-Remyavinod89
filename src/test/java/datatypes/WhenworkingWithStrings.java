package datatypes;

import org.junit.Test;

import java.util.Locale;

public class WhenworkingWithStrings {
    @Test
    public void convertToLowerCase()
    {
        String firstName = "REMYA";
        String lowerCaseName = firstName.toLowerCase();
        System.out.println(lowerCaseName);

    }
    @Test
    public void convertToUpperCase()
    {
        String lastName = "vinod";
        String upperCaseName = lastName.toUpperCase();
        System.out.println(upperCaseName);

    }

    @Test
    public void findLength()
    {
        String place = "Netherlands";
        System.out.println("Length of the placename is" + place.length());
    }
    @Test
    public void trimSpace()
    {
        String place = "Netherlands  ";
        System.out.println("Trim the extra space of the placename " + place.trim());
    }

}

