package overload;
public class Vector3 {
    public int[] vector;
    int scalar;

    public Vector3(int x, int y, int z) {
        this.vector = new int[]{x, y, z};
    }

    public Vector3 multiply(int scalar) {
        return new Vector3(vector[0] * this.scalar, vector[1] * this.scalar, vector[2] * this.scalar);
    }

    public int multiply(Vector3 other) {
        return (this.vector[0] * other.vector[0]) +
               (this.vector[1] * other.vector[1]) +
               (this.vector[2] * other.vector[2]);
    }

    @Override
    public String toString() {
        return "[" + vector[0] + " " + vector[1] + " " + vector[2] + "]";
    }
}
