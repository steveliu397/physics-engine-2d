package physics2d.primitives;

import org.joml.Vector2f;
import physics2d.rigidbody.Rigidbody2D;

public class Ray2D {
    private Vector2f origin;
    private Vector2f direction;

    public Ray2D(Vector2f origin, Vector2f direction) {
        this.origin = origin;
        this.direction = direction;
        this.direction.normalize();
    }

    public Vector2f getOrigin() {
        return this.origin;
    }

    public Vector2f getDirection() {
        return this.direction;
    }
}
