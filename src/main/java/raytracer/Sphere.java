package raytracer;

public class Sphere extends Geometry {
    private double radius;
    private Vec3D center;

    public Sphere(Vec3D center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public boolean intersect(Ray ray) {
        Vec3D origin = ray.getOrigin();
        Vec3D dir = ray.getDirection();

        double firstTerm = Math.pow(dir.normalize().dot(origin.sub(this.center)),2);
        double secondTerm = Math.pow(origin.sub(this.center).len(),2) - Math.pow(this.radius,2);
        double isIntersected = firstTerm - secondTerm;
        if (isIntersected<0){
            System.out.println("The Sphere does not intersect with the line");
            return false;
        }else{
            System.out.println("The Sphere intersects with the line");
            return true;
        }


    }
}
