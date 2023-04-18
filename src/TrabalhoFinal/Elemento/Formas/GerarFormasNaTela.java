package TrabalhoFinal.Elemento.Formas;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GL2ES3;

public class GerarFormasNaTela {
    //private GL2 gl;

    public void gerarQuadrado(Quadrado q, GL2 gl){


        gl.glBegin(GL2ES3.GL_QUADS);

        gl.glVertex2f(q.getVertexA1(), q.getVertexA2());
        gl.glVertex2f(q.getVertexB1(), q.getVertexB2());
        gl.glVertex2f(q.getVertexC1(), q.getVertexC2());
        gl.glVertex2f(q.getVertexD1(), q.getVertexD2());

        gl.glEnd();
        gl.glLoadIdentity();
    }

    public void gerarTriangulo(Triangulo t, GL2 gl){


        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glVertex2f(t.getVertexA1(), t.getVertexA2());
        gl.glVertex2f(t.getVertexB1(), t.getVertexB2());
        gl.glVertex2f(t.getVertexC1(), t.getVertexC2());

        gl.glEnd();
        gl.glLoadIdentity();
    }

    public void gerarCirculo(Circulo c , GL2 gl, int tipo){



        gl.glBegin(GL2.GL_POLYGON);
        c.setAngleIncrement(tipo * Math.PI /c.getNumVertices());
        //System.out.println(c.getAngleIncrement());
        for (int i = 0; i < c.getAngleIncrement(); i++) {
            double aux = i * c.getAngleIncrement();
            System.out.println(i);
            double x = c.getRadius() * Math.cos(c.getAngle());
           // System.out.println(c.getAngle());
            double y = c.getRadius() * Math.sin(c.getAngle());
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();
    }


}
