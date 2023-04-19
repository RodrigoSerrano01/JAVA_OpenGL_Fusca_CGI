package FuscaOpenGL.Application;

import FuscaOpenGL.Listeners.EventListener;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;

public class Render extends JFrame {

    private static GLWindow window;
    public static int altura= 620, largura= 480;




    public static void init(){





        GLProfile.initSingleton();
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities caps = new GLCapabilities(profile);
        // MovimentaTriangulo mv= new MovimentaTriangulo(window);
        window = GLWindow.create(caps);

        window.setSize(altura, largura);




        window.setResizable(false);

        window.addGLEventListener(new EventListener());
       // window.addKeyListener(new KeyBordInput());
        FPSAnimator animator = new FPSAnimator(window, 120);
       animator.start();
        window.setVisible(true);
        animator.start();


    }




    public static void main(String[] args) {
        init();


    }

}
