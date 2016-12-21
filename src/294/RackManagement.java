import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class RackManagement {

  public static boolean scrabble(String letters, String word) {
    StringBuilder lettersBuilder = new StringBuilder(letters);
    char[] wordArray = word.toCharArray();

    for (char c : wordArray) {
      int letterIndex = lettersBuilder.indexOf(Character.toString(c));
      if (letterIndex > -1) {
        lettersBuilder.deleteCharAt(letterIndex);
      } else {
        int wcIndex = lettersBuilder.indexOf("?");
        if (wcIndex > -1) {
          lettersBuilder.deleteCharAt(wcIndex);
        } else {
          return false;
        }
      }
    }

    return true;
  }

  public static String longest(String word) {
    String fileName = "resources/294/enable1.txt";

    //read file into stream, try-with-resources
    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

      String result = stream
          .filter(w -> scrabble(word, w))
          .max(Comparator.comparing(String::length))
          .get();

      return result;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";
  }
}
