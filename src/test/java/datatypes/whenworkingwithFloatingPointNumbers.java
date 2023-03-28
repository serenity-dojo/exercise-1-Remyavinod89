package datatypes;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class whenworkingwithFloatingPointNumbers {

    @Test
    public void convertCelsiusToFahrenheit(){
        double celsius = 36.0;
        double fahrenheit = (celsius * 9/5) + 32;
        double expectedFahrenheit = 96.8;
        System.out.println(celsius + "eqaual to" + fahrenheit);

        assert expectedFahrenheit == fahrenheit;

    }

    @Test
    public void convertKiloToPound(){
        double kilogram = 25.0;
        double pound = kilogram * 2.20462;
        double expectedPound = 55.1155;

        System.out.println(kilogram + "equal to" + pound);

        assertThat(pound , equalTo(expectedPound));
    }
}
