package raytracer;

public class Transform {
    private Vec3D scale;
    private Vec3D rotation;
    private Vec3D translation;

    public Transform(Vec3D scale, Vec3D rotation, Vec3D translation) {
        this.scale = scale;
        this.rotation = rotation;
        this.translation = translation;
    }
}
