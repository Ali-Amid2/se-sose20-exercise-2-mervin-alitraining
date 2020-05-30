package raytracer;

public class Cone extends Geometry{
    private double radius;
    private double height;
    private Vec3D center;
    private Vec3D vertex;

    public Cone(double radius, double height, Vec3D center, Vec3D vertex) {
        this.radius = radius;
        this.height = height;
        this.center = center;
        this.vertex = vertex;
    }
}
