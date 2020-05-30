package raytracer;

public class Vec3D {

    private double x, y, z;

    /**
     * Constructs a Vec3D
     * @param x
     *        The x coordinate.
     * @param y
     *        The y coordinate.
     * @param z
     *        The z coordinate.
     */
    public Vec3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "[ " + x + ", " + y + ", " + z + " ]";
    }

    /**
     * Addition between 3D vectors
     */
    public Vec3D add(Vec3D other) {
        return new Vec3D(x + other.x, y + other.y, z + other.z);
    }

    /**
     * subtraction between 3D vectors
     */
    public Vec3D sub(Vec3D other) {
        return new Vec3D(x - other.x, y - other.y, z - other.z);
    }

    /**
     * scalar multiplication between 3D vectors
     */
    public Vec3D mul(double other) {
        return new Vec3D(x * other, y * other, z * other);
    }

    /**
     * dot product between 3D vectors
     */
    public double dot(Vec3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    /** calculate the length of the vector */
    public double len(){
        double length = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2));

        return length;
    }

    /** normalize the vector to length 1 */
    public Vec3D normalize(){
        double length = len();
        return new Vec3D(this.x/length, this.y/length,this.z/length);
    }

    /** cross product of two vectors */
    public Vec3D cross(Vec3D other){
        double newX=(this.y*other.z - other.y*this.z);
        double newY=-(this.x*other.z - other.x*this.z);
        double newZ=(this.x*other.y - other.x*this.y);

        return new Vec3D(newX, newY, newZ);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
