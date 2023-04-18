package TrabalhoFinal.Listeners;

import TrabalhoFinal.Elemento.Cenario;
import TrabalhoFinal.Elemento.Elemento;
import TrabalhoFinal.Elemento.Formas.Circulo;
import TrabalhoFinal.Elemento.Formas.GerarFormasNaTela;
import TrabalhoFinal.Elemento.Formas.Quadrado;
import TrabalhoFinal.Fusca.Rodas.Rodas;
import com.jogamp.opengl.*;


import java.util.List;

public class EventListener implements GLEventListener {


    GL2 gl;
    List<Elemento> list;
    @Override
    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
        //gl.glLoadIdentity();

        // Configura a matriz de projeção
        //gl.glMatrixMode(GL2.GL_PROJECTION);


    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }


    @Override
    public void display(GLAutoDrawable drawable) {


       // Cenario.cria(gl);
//        Carroceria.cria(gl);
       // Rodas.cria(gl);
//        Vidros.cria(gl);



        Quadrado q = new Quadrado(
                -0.5f,0.5f,
                0.5f,0.5f,
                0.5f,-0.5f,
                -0.5f,-0.5f
        );


        Circulo c = new Circulo(100,0.2);
//
        GerarFormasNaTela g = new GerarFormasNaTela();

        g.gerarCirculo(c,gl,1);


       // gl.glTranslated(-0.4f, 0.05f, 0.0f);
        //gl.glScaled(0.7f,0.7f,0.0);
        gl.glColor3f(0.5f, 0.5f, 0.5f); //set pen color to black
        gl.glBegin(GL2.GL_POLYGON);
        int numVertices = 200;
        double angle = 0, radius = 0.2;
        double angleIncrement = 2 * Math.PI / numVertices;
        System.out.println(angleIncrement);
        for (int i = 0; i < numVertices; i++) {
            angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            gl.glVertex2d(x, y);
        }

//
       // g.gerarQuadrado(q,gl);

        gl.glEnd();
        gl.glLoadIdentity();





    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        GL2 gl = drawable.getGL().getGL2();
        gl.glViewport(0, 0, width, height);

    }
}

//
//90,0,0,90,
//        0.65f,0.8f,0.0f,
//        0.3f,0.02f,0.0f,
//        1.5f,1.5f,0.5f,