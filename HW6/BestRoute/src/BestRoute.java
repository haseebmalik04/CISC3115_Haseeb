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

public class BestRoute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read point A
        String labelA = input.next();
        double xA = input.nextDouble();
        double yA = input.nextDouble();
        Point2D A = new Point2D(labelA, xA, yA);

        // Read point B
        String labelB = input.next();
        double xB = input.nextDouble();
        double yB = input.nextDouble();
        Point2D B = new Point2D(labelB, xB, yB);

        // Read point C
        String labelC = input.next();
        double xC = input.nextDouble();
        double yC = input.nextDouble();
        Point2D C = new Point2D(labelC, xC, yC);

        // Read point D
        String labelD = input.next();
        double xD = input.nextDouble();
        double yD = input.nextDouble();
        Point2D D = new Point2D(labelD, xD, yD);

        Path3 path1 = new Path3("A", A, B, D);
        Path3 path2 = new Path3("B", A, C, D);

        if (path1.length() < path2.length()) {
            System.out.println("Best Route: " + path1.toString());
        } else {
            System.out.println("Best Route: " + path2.toString());
        }

        input.close();
    }
}

