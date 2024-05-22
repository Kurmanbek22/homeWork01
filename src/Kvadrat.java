public class Kvadrat extends Shape{
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getPerimetir() {
        return a*4;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "a=" + a +
                '}';
    }
}
