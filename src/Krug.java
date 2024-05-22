public class Krug extends Shape {
    private int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetir() {
        return radius*radius*3.14 ;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }
}
