public class TwelveDaysOfChristmas {

  public static void main(String[] args) {
    String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth" };
    String[] gifts = { "1 Partridge in a Pear Tree", "2 Turtle Doves", "3 French Hens", "4 Calling Birds",
        "5 Golden Rings", "6 Geese a Laying", "7 Swans a Swimming", "8 Maids a Milking", "9 Ladies Dancing",
        "10 Lords a Leaping", "11 Pipers Piping", "12 Drummers Drumming" };

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
