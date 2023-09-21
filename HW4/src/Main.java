public class Main {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0, 100, 200);
        Point p = new Point(3, 4);

        rectmovleft(box, p);

        System.out.println("New coords: x=" + box.x + ", y=" + box.y);
    }
    public static void rectmovleft(Rectangle box, Point p) {
        if(p.x < 0) {
            throw new IllegalArgumentException("Usage: input x is not legal");
        }
        box.x = box.x + p.x;
        box.y = box.y + p.y;
    }
}
