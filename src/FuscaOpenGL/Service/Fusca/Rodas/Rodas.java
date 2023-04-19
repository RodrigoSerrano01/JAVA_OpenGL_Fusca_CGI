package FuscaOpenGL.Service.Fusca.Rodas;

import FuscaOpenGL.Service.GeradorDeFormas.GerarFormasNaTela;
import FuscaOpenGL.Model.Circulo;
import com.jogamp.opengl.GL2;

public abstract class Rodas  {



    public static void cria(GL2 gl) {



        GerarFormasNaTela gerador = new GerarFormasNaTela();

        Circulo silhuetaRodaUm = new Circulo(0,0,0,0,
                -0.4f, 0.05f, 0.0f,
                0.7f,0.7f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(silhuetaRodaUm,gl, 2);



        gl.glEnd();
        gl.glLoadIdentity();

        Circulo silhuetaRodaDois = new Circulo(0,0,0,0,
                0.2f, 0.05f, 0.0f,
                0.7f,0.7f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(silhuetaRodaDois,gl, 2);




        Circulo detalheRodaUm = new Circulo(0,0,0,0,
                -0.4f, 0.05f, 0.0f,
                0.5f,0.5f,0.0f,
                1.0f, 1.0f, 1.0f);
        gerador.gerarCirculo(detalheRodaUm,gl, 2);



        Circulo detalheRodaDois = new Circulo(0,0,0,0,
                0.2f, 0.05f, 0.0f,
                0.5f,0.5f,0.0f,
                1.0f, 1.0f, 1.0f);
        gerador.gerarCirculo(detalheRodaDois,gl, 2);

    }
    }

