package TrabalhoFinal.Elemento;

import TrabalhoFinal.Elemento.Formas.GerarFormasNaTela;
import TrabalhoFinal.Elemento.Formas.Quadrado;
import TrabalhoFinal.Elemento.Formas.Triangulo;
import com.jogamp.opengl.GL2;

public class Cenario extends Elemento {

    public static void cria(GL2 gl){


//        gl.glScaled(2.0f,1.0f,0.0);
//        gl.glBegin(GL2ES3.GL_QUADS);
//        gl.glColor3f(0.2f, 0.2f, 0.2f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//        gl.glVertex2f(-0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();

//        gl.glScaled(2.0f,0.05f,0.0);
//        gl.glBegin(GL2ES3.GL_QUADS);
//        gl.glColor3f(1.5f, 1.5f, 0.5f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//        gl.glVertex2f(-0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//
        Quadrado q = new Quadrado(-0.5f,0.5f,
                0.5f,0.5f,
                0.5f,-0.5f,
                -0.5f,-0.5f
        );

        Triangulo t = new Triangulo(-0.5f, 0.5f,
                0.5f, 0.5f,
                0.5f, -0.5f);


        GerarFormasNaTela g = new GerarFormasNaTela();

        //g.gerarQuadrado(q, gl);
        g.gerarTriangulo(t,gl);

//        gl.glRotated(90,0,0,90);
//        gl.glTranslated(0.65f, 0.8f, 0.0f);
//        gl.glScaled(0.3f,0.02f,0.0);
//
//        gl.glBegin(GL2ES3.GL_QUADS);
//        gl.glColor3f(1.5f, 1.5f, 0.5f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//        gl.glVertex2f(-0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//
//        gl.glRotated(45,0,0,45);
//        gl.glTranslated(-0.0f, 1.13f, 0.0f);
//        gl.glScaled(0.2f,0.2f,0.0);
//
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glColor3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//
//
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
////
//        gl.glRotated(45,0,0,45);
//        gl.glTranslated(0.02f, 1.15f, 0.0f);
//        gl.glScaled(0.1f,0.1f,0.0);
//
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glColor3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//        gl.glRotated(0,0,0,0);
//        gl.glTranslated(0.5f, 0.65f, 0.0f);
//        gl.glScaled(0.4f,0.2f,0.0);
//
//        gl.glBegin(GL2ES3.GL_QUADS);
//        gl.glColor3f(1.8f, 0.5f, 0.0f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//        gl.glVertex2f(-0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//
//
//
//        gl.glTranslated(0.5f, 0.65f, 0.0f);
//        gl.glScaled(0.1f,0.05f,0.0);
//
//        gl.glBegin(GL2ES3.GL_QUADS);
//        gl.glColor3f(1.0f, 1.5f, 1.5f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//        gl.glVertex2f(-0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//
//
//        gl.glRotated(135,0,0,135);
//        gl.glTranslated(0.12f, -0.80f, 0.0f);
//        gl.glScaled(0.09f,0.09f,0.0);
//
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glColor3f(1.90f, 1.35f, 1.0f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
////
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//        gl.glRotated(45,0,0,45);
//        gl.glTranslated(0.7f, 0.0f, 0.0f);
//        gl.glScaled(0.09f,0.09f,0.0);
//
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glColor3f(1.8f, 0.5f, 0.0f);
//        gl.glVertex2f(-0.5f, 0.5f);
//        gl.glVertex2f(0.5f, 0.5f);
//        gl.glVertex2f(0.5f, -0.5f);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
    }
}


//90,0,0,90,
//                0.65f,0.8f,0.0f,
//                0.3f,0.02f,0.0f,
//                1.5f,1.5f,0.5f,


//gl.glRotated(q.getRotatedAngle(),q.getRotatedX(),q.getRotatedY(),q.getRotatedZ());
//        gl.glTranslated(q.getTransLatedX(), q.getTransLatedY(), q.getTransLatedZ());
//        gl.glScaled(q.getScaledX(),q.getScaledY(),q.getScaledZ());

//gl.glColor3f(q.getColorR(), q.getColorG(), q.getColorB());