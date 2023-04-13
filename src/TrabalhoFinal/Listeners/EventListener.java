package TrabalhoFinal.Listeners;

import TrabalhoFinal.Elemento.Elemento;
import TrabalhoFinal.Fusca.Carroceria.Carroceria;
import TrabalhoFinal.Fusca.Rodas.Rodas;
import TrabalhoFinal.Fusca.Vidros.Vidros;
import com.jogamp.opengl.*;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;

public class EventListener implements GLEventListener {


    GL2 gl;
    List<Elemento> list;
    @Override
    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );

    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }


    @Override
    public void display(GLAutoDrawable drawable) {



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
