import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntersectingRectanglesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
       System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void test1() {

      String[] in = {"0,0 2,2", "1,1 3,3"};

      IntersectingRectangles.main(in);

      assertEquals("1.00", outContent.toString());

    }

    @Test
    public void test2() {

      String[] in = {"-3.5,4 1,1", "1,3.5 -2.5,-1"};

      IntersectingRectangles.main(in);

      assertEquals("8.75", outContent.toString());

    }

    @Test
    public void test3() {

      String[] in = {"-4,4 -0.5,2", "0.5,1 3.5,3"};

      IntersectingRectangles.main(in);

      assertEquals("0.00", outContent.toString());

    }

    @Test
    public void test4() {

      String[] in = {"-3,0 1.8,4", "1,1 -2.5,3.6", "-4.1,5.75 0.5,2", "-1.0,4.6 -2.9,-0.8"};

      IntersectingRectangles.main(in);

      assertEquals("2.40", outContent.toString());

    }

}
