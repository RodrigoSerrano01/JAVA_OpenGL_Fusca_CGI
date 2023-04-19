package FuscaOpenGL.Listeners;

import FuscaOpenGL.Service.Cenario.Cenario;
import FuscaOpenGL.Service.Fusca.Carroceria.Carroceria;
import FuscaOpenGL.Service.Fusca.Rodas.Rodas;
import FuscaOpenGL.Service.Fusca.Vidros.Vidros;
import com.jogamp.opengl.*;

public class EventListener implements GLEventListener {


    public GL2 gl;

    @Override
    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }


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

