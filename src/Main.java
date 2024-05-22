public class Main {
    public static void main(String[] args) {
    Shape[] shapes={
            new TortBurchtuk(12,23,34,21),
            new UchByrchtuk(12,23,12),
            new Kvadrat(5),
            new Krug(4)
    };
    for (Shape shape:shapes){
        System.out.println(shape);
        System.out.println(shape.getPerimetir());
    }


    }
}