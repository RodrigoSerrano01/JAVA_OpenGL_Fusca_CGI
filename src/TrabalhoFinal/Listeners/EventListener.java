package TrabalhoFinal.Listeners;

import TrabalhoFinal.Elemento.Cenario;
import TrabalhoFinal.Elemento.Elemento;
import TrabalhoFinal.Fusca.Carroceria.Carroceria;
import TrabalhoFinal.Fusca.Rodas.Rodas;
import TrabalhoFinal.Fusca.Vidros.Vidros;
import com.jogamp.opengl.*;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static TrabalhoFinal.Application.Render.altura;
import static TrabalhoFinal.Application.Render.largura;
import static java.lang.Math.*;

public class EventListener implements GLEventListener {


    GL2 gl;
    List<Elemento> list;
    @Override
    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );

        // Configura a matriz de projeção
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-largura/2, largura/2, -altura/2, altura/2, -1.0, 1.0);


    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }
//
//    private void desenharObjeto(float[] vertices, float[] escala, float[] translacao, float rotacao) {
//        // Salva a matriz atual
//        gl.glPushMatrix();
//
//        // Aplica as transformações geométricas
//        gl.glTranslatef(translacao[0], translacao[1], 0.0f);
//        gl.glRotatef(rotacao, 0.0f, 0.0f, 1.0f);
//        gl.glScalef(escala[0], escala[1], escala[2]);
//
//        // Desenha o objeto
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glColor3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex2f(vertices[0], vertices[1]);
//        gl.glVertex2f(vertices[2], vertices[3]);
//        gl.glVertex2f(vertices[4], vertices[5]);
//
//        gl.glEnd();
//        gl.glLoadIdentity();
//
//        // Restaura a matriz original
//        gl.glPopMatrix();
//    }


    @Override
    public void display(GLAutoDrawable drawable) {


        Cenario.cria(gl);
        Carroceria.cria(gl);
        Rodas.cria(gl);
        Vidros.cria(gl);





    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        GL2 gl = drawable.getGL().getGL2();
        gl.glViewport(0, 0, width, height);

    }
}
