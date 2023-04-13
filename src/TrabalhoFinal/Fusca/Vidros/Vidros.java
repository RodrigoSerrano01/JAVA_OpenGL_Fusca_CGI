package TrabalhoFinal.Fusca.Vidros;

import TrabalhoFinal.Elemento.Elemento;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GL2ES3;

public  abstract class Vidros extends Elemento {




    public static void cria(GL2 gl){

        gl.glTranslated(-0.03f, 0.3f, 0.0f);
        gl.glColor3f(1.5f, 1.5f, 1.5f); //set pen color to black
        gl.glScaled(1.2f,0.7f,0.0);
        // approximate  a circle with a polygon
        gl.glBegin(GL2.GL_POLYGON);
//        gl.glBegin(GL2.GL_TRIANGLE_FAN);

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


        gl.glTranslated(-0.00f, 0.37f, 0.0f);
        gl.glScaled(0.02f,0.15f,0.0);
        gl.glBegin(GL2ES3.GL_QUADS);
        gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glVertex2f(-0.5f, 0.5f);
        gl.glVertex2f(0.5f, 0.5f);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glVertex2f(-0.5f, -0.5f);


        gl.glEnd();
        gl.glLoadIdentity();
        gl.glRotated(143,0,0,143);
        gl.glTranslated(0.4f, -0.17f, 0.0f);
        gl.glScaled(0.03f,0.19f,0.0);
        gl.glBegin(GL2ES3.GL_QUADS);
        gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glVertex2f(-0.5f, 0.5f);
        gl.glVertex2f(0.5f, 0.5f);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glVertex2f(-0.5f, -0.5f);


        gl.glEnd();
        gl.glLoadIdentity();


    }
}
