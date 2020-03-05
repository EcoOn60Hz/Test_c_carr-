public class Point {
    int x;
    int y;

    Point() {
        x = -1;
        y = -1;
    }

    Point(int x, int y) {
        x = x;
        y = y;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}
