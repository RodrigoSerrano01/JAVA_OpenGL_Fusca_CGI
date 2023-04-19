package FuscaOpenGL.Service.GeradorDeFormas;

import FuscaOpenGL.Model.Circulo;
import FuscaOpenGL.Model.Quadrado;
import FuscaOpenGL.Model.Triangulo;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GL2ES3;

public class GerarFormasNaTela {
    //private GL2 gl;

    public void gerarQuadrado(Quadrado q, GL2 gl){

        gl.glRotated(q.getRotatedAngle(),q.getRotatedX(),q.getRotatedY(),q.getRotatedZ());
        gl.glTranslated(q.getTransLatedX(), q.getTransLatedY(), q.getTransLatedZ());
        gl.glScaled(q.getScaledX(),q.getScaledY(),q.getScaledZ());

        gl.glColor3f(q.getColorR(), q.getColorG(), q.getColorB());


        gl.glBegin(GL2ES3.GL_QUADS);

        gl.glVertex2f(q.getVertexA1(), q.getVertexA2());
        gl.glVertex2f(q.getVertexB1(), q.getVertexB2());
        gl.glVertex2f(q.getVertexC1(), q.getVertexC2());
        gl.glVertex2f(q.getVertexD1(), q.getVertexD2());

        gl.glEnd();
        gl.glLoadIdentity();
    }

    public void gerarTriangulo(Triangulo t, GL2 gl){
        gl.glRotated(t.getRotatedAngle(),t.getRotatedX(),t.getRotatedY(),t.getRotatedZ());
        gl.glTranslated(t.getTransLatedX(), t.getTransLatedY(), t.getTransLatedZ());
        gl.glScaled(t.getScaledX(),t.getScaledY(),t.getScaledZ());
        gl.glColor3f(t.getColorR(), t.getColorG(), t.getColorB());


        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glVertex2f(t.getVertexA1(), t.getVertexA2());
        gl.glVertex2f(t.getVertexB1(), t.getVertexB2());
        gl.glVertex2f(t.getVertexC1(), t.getVertexC2());

        gl.glEnd();
        gl.glLoadIdentity();
    }

    public void gerarCirculo(Circulo c , GL2 gl, int tipo){


        gl.glTranslated(c.getTransLatedX(), c.getTransLatedY(), c.getTransLatedZ());
        gl.glColor3f(c.getColorR(), c.getColorG(), c.getColorB());

        gl.glRotated(c.getRotatedAngle(),c.getRotatedX(),c.getRotatedY(),c.getRotatedZ());
        gl.glScaled(c.getScaledX(),c.getScaledY(),c.getScaledZ());

        gl.glBegin(GL2.GL_POLYGON);
        c.setAngleIncrement(tipo * Math.PI /c.getNumVertices());
        for (int i = 0; i < c.getNumVertices(); i++) {
             c.setAngle( i * c.getAngleIncrement());
            double x = c.getRadius() * Math.cos(c.getAngle());
            double y = c.getRadius() * Math.sin(c.getAngle());
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();
    }


}
