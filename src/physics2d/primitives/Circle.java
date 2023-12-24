package physics2d.primitives;

public class Circle {
    private float radius = 1.0f;

    private float getRadius() {
        return this.radius;
    }

    public Vector2f getCenter() {
        return body.getPosition();
    }
}
