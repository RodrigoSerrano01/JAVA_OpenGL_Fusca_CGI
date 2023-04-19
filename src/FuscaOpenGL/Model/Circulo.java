package FuscaOpenGL.Model;

public class Circulo  extends Formas{


    private double angle;
    private double angleIncrement;
    private int numVertices;

    private double radius;



    public Circulo(float rotatedAngle, float rotatedX, float rotatedY, float rotatedZ, float transLatedX, float transLatedY, float transLatedZ, float scaledX, float scaledY, float scaledZ, float colorR, float colorG, float colorB) {
        super(rotatedAngle, rotatedX, rotatedY, rotatedZ, transLatedX, transLatedY, transLatedZ, scaledX, scaledY, scaledZ, colorR, colorG, colorB);
        this.angle = 0;
        this.angleIncrement = 0;
        this.numVertices = 200;
        this.radius = 0.2;
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
