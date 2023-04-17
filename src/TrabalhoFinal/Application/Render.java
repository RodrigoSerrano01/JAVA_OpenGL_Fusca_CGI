package TrabalhoFinal.Application;

import TrabalhoFinal.Listeners.EventListener;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
import javax.swing.*;

public class Render extends JFrame {

    private static GLWindow window;

    public static void init() {

        GLProfile.initSingleton();
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities caps = new GLCapabilities(profile);
        window = GLWindow.create(caps);
        window.setSize(620, 480);
        window.setTitle("Projeto Pratíco N1 - Computação gráfica.");

        window.setResizable(false);

        window.addGLEventListener(new EventListener());
        FPSAnimator animator = new FPSAnimator(window, 120);
        animator.start();
        window.setVisible(true);
        animator.start();

    }

    public static void main(String[] args) {
        init();
    }
}
