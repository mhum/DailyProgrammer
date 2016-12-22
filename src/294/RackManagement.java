import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RackManagement {

  public static boolean scrabble(String letters, String word) {
    String used = test(letters, word);
    if (used != null) {
      return true;
    }

    return false;
  }

  private static String test(String letters, String word) {
    StringBuilder lettersBuilder = new StringBuilder(letters);
    char[] wordArray = word.toCharArray();
    StringBuilder lettersUsed = new StringBuilder();

    for (char c : wordArray) {
      int letterIndex = lettersBuilder.indexOf(Character.toString(c));
      if (letterIndex > -1) {
        lettersUsed.append(lettersBuilder.charAt(letterIndex));
        lettersBuilder.deleteCharAt(letterIndex);
      } else {
        int wcIndex = lettersBuilder.indexOf("?");
        if (wcIndex > -1) {
          lettersUsed.append("?");
          lettersBuilder.deleteCharAt(wcIndex);
        } else {
          return null;
        }
      }
    }

    return lettersUsed.toString();
  }

  public static String longest(String word) {
    String fileName = "resources/294/enable1.txt";

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

  public static Integer score(String word) {
    Map<String, Integer> scores = new HashMap<>();
    scores.put("a", 1);
    scores.put("b", 3);
    scores.put("c", 3);
    scores.put("d", 2);
    scores.put("e", 1);
    scores.put("f", 4);
    scores.put("g", 2);
    scores.put("h", 4);
    scores.put("i", 1);
    scores.put("j", 8);
    scores.put("k", 5);
    scores.put("l", 1);
    scores.put("m", 3);
    scores.put("n", 1);
    scores.put("o", 1);
    scores.put("p", 3);
    scores.put("q", 10);
    scores.put("r", 1);
    scores.put("s", 1);
    scores.put("t", 1);
    scores.put("u", 1);
    scores.put("v", 4);
    scores.put("w", 4);
    scores.put("x", 8);
    scores.put("y", 4);
    scores.put("z", 10);
    scores.put("?", 0);

    Integer score = 0;

    for (char c : word.toCharArray()) {
      score = score + scores.get(String.valueOf(c));
    }

    return score;
  }

  public static String highest(String word) {
    String fileName = "resources/294/enable1.txt";

    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

      Map<String, Integer> results = new HashMap<>();

      stream.forEach(w -> {
        String letters = test(word, w);
        if (letters != null) {
          results.put(w, score(letters));
        }
      });

      String result = results.entrySet().stream()
          .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
          .findFirst()
          .get()
          .getKey();

      return result;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";
  }
}
