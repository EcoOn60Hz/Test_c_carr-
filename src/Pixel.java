public class Pixel {
    Point position;
    String couleur;

    Pixel() {
        position = null;
        couleur = null;
    }

    Pixel(int x, int y, String couleur) {
        x = x;
        y = y;
    }

    public String toString() {
        return position.toString() + ", couleur: " + couleur;
    }
}
