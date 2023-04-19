package FuscaOpenGL.Model;

public class Quadrado extends Formas{


    private float vertexA1;
    private float vertexA2;

    private float vertexB1;
    private float vertexB2;

    private float vertexC1;
    private float vertexC2;

    private float vertexD1;

    private float vertexD2;


    public Quadrado(float rotatedAngle, float rotatedX, float rotatedY, float rotatedZ, float transLatedX, float transLatedY, float transLatedZ, float scaledX, float scaledY, float scaledZ, float colorR, float colorG, float colorB) {
        super(rotatedAngle, rotatedX, rotatedY, rotatedZ, transLatedX, transLatedY, transLatedZ, scaledX, scaledY, scaledZ, colorR, colorG, colorB);
        this.vertexA1 = -0.5f;
        this.vertexA2 = 0.5f;
        this.vertexB1 = 0.5f;
        this.vertexB2 = 0.5f;
        this.vertexC1 = 0.5f;
        this.vertexC2 = -0.5f;
        this.vertexD1 = -0.5f;
        this.vertexD2 = -0.5f;
    }



    public float getVertexA1() {
        return vertexA1;
    }

    public float getVertexA2() {
        return vertexA2;
    }

    public float getVertexB1() {
        return vertexB1;
    }

    public float getVertexB2() {
        return vertexB2;
    }

    public float getVertexC1() {
        return vertexC1;
    }

    public float getVertexC2() {
        return vertexC2;
    }

    public float getVertexD1() {
        return vertexD1;
    }

    public float getVertexD2() {
        return vertexD2;
    }
}


