import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kolbm on 06.05.2017.
 */
public class TestRent{
    private Movie m1;
    private Movie m2;
    private Rental r1;
    private Rental r2;
    private Customer customer;
    String test = "Rental Record for joe\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "\tmovie1\t\t10\t30.0\n" +
            "\tmovie2\t\t5\t4.5\n" +
            "Amount owed is 34.5\n" +
            "You earned 3 frequent renter points";

    @Before
    public void init(){
        m1 = new Movie("movie1", 1);
        m2 = new Movie("movie2", 2);

        r1 = new Rental(m1, 10);
        r2 = new Rental(m2, 5);

        customer = new Customer("joe");
    }

    @Test
    public void testCase(){
        customer.addRental(r1);
        customer.addRental(r2);
        assertEquals(customer.statement(), test);
    }
}
