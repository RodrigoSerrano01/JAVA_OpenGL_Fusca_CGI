package TrabalhoFinal.Fusca.Carroceria;

import TrabalhoFinal.Elemento.Elemento;
import com.jogamp.opengl.GL2;

public abstract class Carroceria extends Elemento {

    public static void cria(GL2 gl) {

        //Carroceria
        gl.glTranslated(0.0f, -0.0f, 0.0f);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glScaled(2.0f, 2.5f, 0.0);

        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);

        double angle = 0;
        double angleIncrement = 1 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();


        gl.glTranslated(-0.05f, 0.29f, 0.0f);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glScaled(1.3f, 1.0f, 0.0);
        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 1 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

        gl.glEnd();
        gl.glLoadIdentity();

        gl.glTranslated(-0.37f, 0.0f, 0.0f);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glScaled(1.2f, 1.5f, 0.0);

        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 1 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        gl.glLoadIdentity();


        gl.glTranslated(-0.55f, 0.06f, 0.0f);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glRotated(90, 0, 0, 90);
        gl.glScaled(0.2f, 0.4f, 0.0);
        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 1 * Math.PI / numVertices;
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
        gl.glLoadIdentity();

        gl.glTranslated(0.37f, 0.06f, 0.0f);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glRotated(270, 0, 0, 270);
        gl.glScaled(0.2f, 0.4f, 0.0);
        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);

        angle = 0;
        angleIncrement = 1 * Math.PI / numVertices;
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
