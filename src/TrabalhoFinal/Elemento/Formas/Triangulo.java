package TrabalhoFinal.Elemento.Formas;

public class Triangulo implements Formas{


    private float vertexA1;
    private float vertexA2;

    private float vertexB1;
    private float vertexB2;

    private float vertexC1;
    private float vertexC2;

    public Triangulo(float vertexA1, float vertexA2, float vertexB1, float vertexB2, float vertexC1, float vertexC2) {
        this.vertexA1 = vertexA1;
        this.vertexA2 = vertexA2;
        this.vertexB1 = vertexB1;
        this.vertexB2 = vertexB2;
        this.vertexC1 = vertexC1;
        this.vertexC2 = vertexC2;
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
}


