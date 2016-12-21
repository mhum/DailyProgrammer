import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwelveDaysOfChristmasTest {

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
  public void test() {
    String song = "On the first day of Christmas\n"
        + "my true love sent to me:\n"
        + "1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the second day of Christmas\n"
        + "my true love sent to me:\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the third day of Christmas\n"
        + "my true love sent to me:\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the fourth day of Christmas\n"
        + "my true love sent to me:\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the fifth day of Christmas\n"
        + "my true love sent to me:\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the sixth day of Christmas\n"
        + "my true love sent to me:\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the seventh day of Christmas\n"
        + "my true love sent to me:\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the eighth day of Christmas\n"
        + "my true love sent to me:\n"
        + "8 Maids a Milking\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the ninth day of Christmas\n"
        + "my true love sent to me:\n"
        + "9 Ladies Dancing\n"
        + "8 Maids a Milking\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the tenth day of Christmas\n"
        + "my true love sent to me:\n"
        + "10 Lords a Leaping\n"
        + "9 Ladies Dancing\n"
        + "8 Maids a Milking\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the eleventh day of Christmas\n"
        + "my true love sent to me:\n"
        + "11 Pipers Piping\n"
        + "10 Lords a Leaping\n"
        + "9 Ladies Dancing\n"
        + "8 Maids a Milking\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n"
        + "\n"
        + "On the twelfth day of Christmas\n"
        + "my true love sent to me:\n"
        + "12 Drummers Drumming\n"
        + "11 Pipers Piping\n"
        + "10 Lords a Leaping\n"
        + "9 Ladies Dancing\n"
        + "8 Maids a Milking\n"
        + "7 Swans a Swimming\n"
        + "6 Geese a Laying\n"
        + "5 Golden Rings\n"
        + "4 Calling Birds\n"
        + "3 French Hens\n"
        + "2 Turtle Doves\n"
        + "and 1 Partridge in a Pear Tree\n";

    TwelveDaysOfChristmas.main(null);

    assertEquals(outContent.toString(), song);
  }

}
