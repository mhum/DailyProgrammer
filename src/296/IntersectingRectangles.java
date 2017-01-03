public class IntersectingRectangles {

  public static void main(String[] args) {
    Rectangle overlap = new Rectangle(args[0]);

    for (int x = 0; x < args.length; x++) {
      if (x != 0) {
        Rectangle rectangle = new Rectangle(args[x]);
        overlap = getOverlap(rectangle, overlap);
      }
    }

    double area = overlap.area();

    System.out.printf("%.2f", area);

  }

  public static Rectangle getOverlap(Rectangle rec1, Rectangle rec2) {
    double top = Math.max(rec1.top, rec2.top);
    double bottom = Math.min(rec1.bottom, rec2.bottom);
    double left = Math.max(rec1.left, rec2.left);
    double right = Math.min(rec1.right, rec2.right);

    return new Rectangle(top, bottom, left, right);
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

  public Rectangle(double top, double bottom, double left, double right) {
    this.top = top;
    this.bottom = bottom;
    this.left = left;
    this.right = right;
  }

  public double area() {
    return (top >= bottom) || (left >= right) ? 0.0 : (bottom - top) * (right - left);
  }
}
