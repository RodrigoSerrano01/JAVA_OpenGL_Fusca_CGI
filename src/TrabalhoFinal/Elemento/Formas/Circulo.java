package TrabalhoFinal.Elemento.Formas;

public class Circulo {


    private double angle;
    private double angleIncrement;
    private int numVertices;

    private double radius;

    public Circulo( int numVertices, double radius) {
        this.angle = 0;
        this.angleIncrement = 0;
        this.numVertices = numVertices;
        this.radius = radius;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngleIncrement() {
        return angleIncrement;
    }

    public void setAngleIncrement(double angleIncrement) {
        this.angleIncrement = angleIncrement;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
