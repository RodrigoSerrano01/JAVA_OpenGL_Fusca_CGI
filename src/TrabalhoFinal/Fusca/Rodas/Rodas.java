package TrabalhoFinal.Fusca.Rodas;

import TrabalhoFinal.Elemento.Elemento;
import com.jogamp.opengl.GL2;

public abstract class Rodas extends Elemento {
    public static void cria(GL2 gl) {

        gl.glTranslated(-0.4f, 0.05f, 0.0f);
        gl.glScaled(0.7f, 0.7f, 0.0);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 2 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();

        gl.glTranslated(0.2f, 0.05f, 0.0f);
        gl.glScaled(0.7f, 0.7f, 0.0);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 2 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();

        gl.glTranslated(-0.4f, 0.05f, 0.0f);
        gl.glScaled(0.5f, 0.5f, 0.0);
        gl.glColor3f(1.5f, 1.5f, 1.5f); //set pen color to black
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 2 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();

        gl.glTranslated(0.2f, 0.05f, 0.0f);
        gl.glScaled(0.5f, 0.5f, 0.0);
        gl.glColor3f(1.5f, 1.5f, 1.5f); //set pen color to black
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 2 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();

    }
}

