import java.util.Scanner;

class Point2D {
    private double x, y;
    private String label;

    public double distance(Point2D other) {
        double deltaX = other.x - this.x;
        double deltaY = other.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return label + "(" + x + "," + y + ")";
    }

    public Point2D() {
        this.x = 0;
        this.y = 0;
        this.label = "";
    }

    public Point2D(String label, double x, double y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public Point2D(Scanner scanner) {
        this.label = scanner.next();
        this.x = scanner.nextDouble();
        this.y = scanner.nextDouble();
    }

    public Point2D(String label, Scanner scanner) {
        this.label = label;
        this.x = scanner.nextDouble();
        this.y = scanner.nextDouble();
    }
}

class Path3 {
    private String label;
    private Point2D startPoint, intermediatePoint, endPoint;

    public String toString() {
        return startPoint.getLabel() + "-" + intermediatePoint.getLabel() + "-" + endPoint.getLabel();
    }

    public double length() {
        return startPoint.distance(intermediatePoint) + intermediatePoint.distance(endPoint);
    }

    public String getLabel() {
        return label;
    }

    public Path3(String label, Point2D startPoint, Point2D intermediatePoint, Point2D endPoint) {
        this.label = label;
        this.startPoint = startPoint;
        this.intermediatePoint = intermediatePoint;
        this.endPoint = endPoint;
    }

    public Path3(Scanner scanner) {
        this.label = scanner.next();
        this.startPoint = new Point2D(this.label, scanner);
        this.intermediatePoint = new Point2D(this.label, scanner);
        this.endPoint = new Point2D(this.label, scanner);
    }
}

public class ShortestPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path3 path1 = new Path3(input);
        Path3 path2 = new Path3(input);

        double length1 = path1.length();
        double length2 = path2.length();

        System.out.println(path1.getLabel() + ": " + length1);
        System.out.println(path2.getLabel() + ": " + length2);

        if (length1 < length2) {
            System.out.println("shortest path: " + path1.getLabel());
        } else {
            System.out.println("shortest path: " + path2.getLabel());
        }

        input.close();
    }
}
