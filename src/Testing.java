public class Testing {
    public static void main(String[] args) {
        Point p1 = new Point(23, 45);
        System.out.println("p1: " + p1);

        Pixel px1 = new Pixel();
        System.out.println("px1: " + px1);

        Pixel px2 = new Pixel(12, 78, "rouge");
        System.out.println("px2: " + px2);
    }
}
