package raytracer;

public class Shape {
    private Geometry geometry;
    private Appearance appearance;

    public Shape(Geometry geometry, Appearance appearance) {
        this.geometry = geometry;
        this.appearance = appearance;
    }
}
