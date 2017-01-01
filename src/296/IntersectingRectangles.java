import java.util.ArrayList;

public class IntersectingRectangles {

  public static void main(String[] args) {
    ArrayList<Rectangle> rectangles = new ArrayList<>();

    for (String coords : args) {
      Rectangle rectangle = new Rectangle(coords);
      rectangles.add(rectangle);
    }

    double top = Math.max(rectangles.get(0).top, rectangles.get(1).top);
    double bottom = Math.min(rectangles.get(0).bottom, rectangles.get(1).bottom);
    double right = Math.min(rectangles.get(0).right, rectangles.get(1).right);
    double left = Math.max(rectangles.get(0).left, rectangles.get(1).left);

    double area = (top >= bottom) || (left >= right) ? 0.0 : (bottom - top) * (right - left);

    System.out.print(area);

  }
}

class Rectangle {
  public double top;
  public double bottom;
  public double left;
  public double right;

  public Rectangle(String coords) {
    String a = coords.split(" ")[0];
    String b = coords.split(" ")[1];

    top = Math.min(Double.parseDouble(a.split(",")[1]), Double.parseDouble(b.split(",")[1]));
    left = Math.min(Double.parseDouble(a.split(",")[0]), Double.parseDouble(b.split(",")[0]));
    bottom = Math.max(Double.parseDouble(a.split(",")[1]), Double.parseDouble(b.split(",")[1]));
    right = Math.max(Double.parseDouble(a.split(",")[0]), Double.parseDouble(b.split(",")[0]));

  }
}
