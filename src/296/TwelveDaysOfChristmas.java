public class TwelveDaysOfChristmas {

  public static void main(String[] args) {
    String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth" };
    String[] gifts = { "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds",
        "five Golden Rings", "six Geese a Laying", "seven Swans a Swimming", "eight Maids a Milking", "nine Ladies Dancing",
        "ten Lords a Leaping", "eleven Pipers Piping", "twelve Drummers Drumming" };

    for (int i = 0; i < days.length; i++) {
      System.out.println("On the " + days[i] + " day of Christmas");
      System.out.println("my true love sent to me:");
      for (int x = i; x > -1; x--) {
        if (x == 0 & i > 0) {
          System.out.println("and " + gifts[x]);
        } else {
          System.out.println(gifts[x]);
        }
      }
      if (i < days.length - 1) {
        System.out.println();
      }
    }
  }
}
