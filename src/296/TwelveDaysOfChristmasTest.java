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
        + "a Partridge in a Pear Tree\n"
        + "\n"
        + "On the second day of Christmas\n"
        + "my true love sent to me:\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the third day of Christmas\n"
        + "my true love sent to me:\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the fourth day of Christmas\n"
        + "my true love sent to me:\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the fifth day of Christmas\n"
        + "my true love sent to me:\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the sixth day of Christmas\n"
        + "my true love sent to me:\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the seventh day of Christmas\n"
        + "my true love sent to me:\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the eighth day of Christmas\n"
        + "my true love sent to me:\n"
        + "eight Maids a Milking\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the ninth day of Christmas\n"
        + "my true love sent to me:\n"
        + "nine Ladies Dancing\n"
        + "eight Maids a Milking\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the tenth day of Christmas\n"
        + "my true love sent to me:\n"
        + "ten Lords a Leaping\n"
        + "nine Ladies Dancing\n"
        + "eight Maids a Milking\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the eleventh day of Christmas\n"
        + "my true love sent to me:\n"
        + "eleven Pipers Piping\n"
        + "ten Lords a Leaping\n"
        + "nine Ladies Dancing\n"
        + "eight Maids a Milking\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n"
        + "\n"
        + "On the twelfth day of Christmas\n"
        + "my true love sent to me:\n"
        + "twelve Drummers Drumming\n"
        + "eleven Pipers Piping\n"
        + "ten Lords a Leaping\n"
        + "nine Ladies Dancing\n"
        + "eight Maids a Milking\n"
        + "seven Swans a Swimming\n"
        + "six Geese a Laying\n"
        + "five Golden Rings\n"
        + "four Calling Birds\n"
        + "three French Hens\n"
        + "two Turtle Doves\n"
        + "and a Partridge in a Pear Tree\n";

    TwelveDaysOfChristmas.main(null);

    assertEquals(outContent.toString(), song);
  }

}
